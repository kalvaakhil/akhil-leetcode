class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        curr = ''
        for i in range(len(s)//2):
            curr = curr + s[i]
            if curr * (len(s) // len(curr)) == s  and curr != s:
                    return True
        return False
        # if(len(s)>1):
        #     x=s[0]
        #     for j in range(1,len(s)):
        #         if(x==s[j]):
        #             sub=s[:j]
        #             break
        #     l=len(sub)
        #     le=len(s)
        #     x=le//l
        #     st=sub*x
        #     if(st==s):
        #         return True
        #     else:
        #         return False
        # else:
        #     return  False
        