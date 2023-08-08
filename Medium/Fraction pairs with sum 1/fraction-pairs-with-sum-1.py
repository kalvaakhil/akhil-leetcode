#User function Template for python3

from math import gcd
class Solution:
    def countFractions(self, n, numerator, denominator):
        # Your code here
        ans=0
        hash={}
        for n,d in zip(numerator,denominator):
            g=gcd(n,d)
            n//=g
            d//=g
            ans+=hash.get((d-n,d),0)
            hash[(n,d)]=hash.get((n,d),0)+1
        return ans


#{ 
 # Driver Code Starts

#Initial Template for Python 3

for _ in range(int(input())):
    n = int(input())
    numerator = list(map(int,input().split()))
    denominator = list(map(int,input().split()))
    ob = Solution()
    print(ob.countFractions(n,numerator,denominator))
# } Driver Code Ends