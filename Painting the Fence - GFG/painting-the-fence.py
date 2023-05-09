#User function Template for python3

class Solution:

    def countWays(self,n,k):

        mod=10**9+7

        if n==1:

            return k

        same=k

        diff=k*(k-1)

        total=same+diff

        for i in range(3,n+1):

            same=diff%mod

            diff=(total*(k-1))%mod

            total=(same+diff)%mod

        return total



#{ 
 # Driver Code Starts
#Initial Template for Python 3




t=int(input())
for _ in range(0,t):
    x=list(map(int,input().split()))
    n=x[0]
    k=x[1]
    ob = Solution()
    ans=ob.countWays(n,k)
    print(ans)

# } Driver Code Ends