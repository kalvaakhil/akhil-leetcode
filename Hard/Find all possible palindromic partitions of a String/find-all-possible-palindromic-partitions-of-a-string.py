#User function Template for python3

class Solution:
    def checkPalindrome(self, s):
        n = len(s)
        i, j = 0, n - 1
        while i < j:
            if s[i] != s[j]:
                return False
            i += 1
            j -= 1
        return True

    def Partition(self, res, s, idx, curr):
        if idx == len(s):
            res.append(curr[:])
            return
        
        t = ""
        for i in range(idx, len(s)):
            t += s[i]
            if self.checkPalindrome(t):
                curr.append(t)
                self.Partition(res, s, i + 1, curr)
                curr.pop()

    def allPalindromicPerms(self, S):
        res = []
        self.Partition(res, S, 0, [])
        return res


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        S=input()
        
        ob = Solution()
        allPart = ob.allPalindromicPerms(S)
        for i in range(len(allPart)): 
            for j in range(len(allPart[i])): 
                print(allPart[i][j], end = " ") 
            print() 
# } Driver Code Ends