#User function Template for python3

class Solution:
    def sumOfNaturals(self, n):
        mod = 10**9+7
        total_sum = (n * (n+1)) // 2
        
        return int(total_sum % mod)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        n = int(input())
        
        ob = Solution()
        print(ob.sumOfNaturals(n))
# } Driver Code Ends