#User function Template for python3

class Solution:
    def knapSack(self, N, W, val, wt):
        # code here
        # Create a list to store the maximum values for different weights
        dp = [0] * (W + 1)
    
        # Iterate through all items
        for i in range(N):
            # Iterate through all possible weights from wt[i] to W
            for w in range(wt[i], W + 1):
                # Update dp[w] if including the current item increases the value
                dp[w] = max(dp[w], dp[w - wt[i]] + val[i])
    
        # The maximum value is stored in dp[W]
        return dp[W]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N, W = [int(x) for x in input().split()]
        val = input().split()
        for itr in range(N):
            val[itr] = int(val[itr])
        wt = input().split()
        for it in range(N):
            wt[it] = int(wt[it])
        
        ob = Solution()
        print(ob.knapSack(N, W, val, wt))
# } Driver Code Ends