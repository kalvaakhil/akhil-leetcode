#User function Template for python3
class Solution:
    def isReversible(self, str, n):
        # code here
        return 1 if str==str[::-1] else 0
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        n = int(input().strip())
        str= input().strip()
        ob = Solution()
        print(ob.isReversible(str, n))
# } Driver Code Ends