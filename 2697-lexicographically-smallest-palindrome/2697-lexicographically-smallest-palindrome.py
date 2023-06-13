class Solution:
    def makeSmallestPalindrome(self, s: str) -> str:
        s=[i for i in s]
        j=len(s)-1
        i=0
        while(i<j):
            if(s[i]!=s[j]):
                if(s[i]<s[j]):
                    s[j]=s[i]
                else:
                    s[i]=s[j]
            if(s==s[::-1]):
                break
            i+=1
            j-=1
        return "".join(s)
                    