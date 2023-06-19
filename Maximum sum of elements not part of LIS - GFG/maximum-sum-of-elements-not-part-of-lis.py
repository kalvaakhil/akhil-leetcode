#User function Template for python3

class Solution:
    def maxSumLis(self, A, N):
       # dp[i] = info of seq that has ith elem as first elem 
       dp = [ [-1, -1] for _ in range(N)]  # [LIS len, minsum_of_chosen_elems]
       dp[N-1] = [1, A[N-1]]
       for i in reversed(range(N-1)):
           dp[i] = v = [1, A[i]]
           for j in range(i+1, N):
               if A[i] < A[j]:
                   L, minv = dp[j][0] + 1, dp[j][1] + A[i]
                   if L>v[0] or L==v[0] and minv<v[1]:
                       v[:] = L, minv
       ans = max(dp, key=lambda x: (x[0], -x[1]))
       return sum(A)-ans[1]



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range (t):
        n = int(input())
        Arr = input().split()
        for itr in range(n):
            Arr[itr] = int(Arr[itr])
        
        ob = Solution()
        print(ob.maxSumLis(Arr, n))
# } Driver Code Ends