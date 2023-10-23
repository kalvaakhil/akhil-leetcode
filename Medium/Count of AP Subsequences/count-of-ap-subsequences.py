#User function Template for python3

class Solution:
    def count(self,N,A):
        from collections import Counter
        dp = [Counter() for _ in range(N)]
        ans = 1
        for i in range(N):
            ans += 1
            for j in range(i):
                d = A[i]-A[j]
                v = dp[j][d]
                if v > 0:
                    dp[i][d] += v+1
                    ans += v
                else:
                    dp[i][d] = 2
                    ans += 1
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
        A = [int(item) for item in input().split()]
        ob = Solution()
        print(ob.count(N,A))
# } Driver Code Ends