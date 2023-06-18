class Solution:
    def distributeTicket(self, n : int, k : int) -> int:
        N = [i+1 for i in range(n)]
        if n <= k:
            return N[-1]
        for i in range(1, len(N)//k+1):
                if i%2 != 0:
                    N = N[k:]
                    if len(N) <= k:
                        return N[0]
                        break
                else:
                    N = N[:(len(N) - k)]
                    if len(N) <= k:
                        return N[-1]
                        break


#{ 
 # Driver Code Starts
t = int(input())
for _ in range(t):
    
    N, K = map(int, input().split())
    
    obj = Solution()
    res = obj.distributeTicket(N, K)
    
    print(res)
# } Driver Code Ends