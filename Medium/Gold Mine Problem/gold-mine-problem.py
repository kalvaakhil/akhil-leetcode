# User function Template for Python3

class Solution:
    def maxGold(self, n, m, M):
        # code here
        dp = {}
        def findpath(i,j):
            if i == n or j == m or i<0 or j<0:
                return 0
            if (i,j) in dp:
                return dp[(i,j)]
            dp[(i,j)] = M[i][j]+max(findpath(i,j+1),findpath(i+1,j+1),findpath(i-1,j+1))
            return dp[(i,j)]
        res = 0
        for i in range(n):
            res = max(res,findpath(i,0))
        return res


#{ 
 # Driver Code Starts
# Initial Template for Python3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, m = [int(x) for x in input().split()]
        tarr = [int(x) for x in input().split()]
        M = []
        j = 0
        for i in range (n):
            M.append(tarr[j:j + m])
            j = j+m
        
        ob = Solution()
        print(ob.maxGold(n, m, M))
# } Driver Code Ends