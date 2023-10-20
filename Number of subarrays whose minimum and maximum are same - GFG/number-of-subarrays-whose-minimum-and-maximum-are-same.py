#User function Template for python3

class Solution:
    def numberOfways(self, a, n): 
        # Complete the function
        d = 1
        ans = 0
        
        for i in range(n-1):
            if a[i] == a[i+1]:
                d += 1
            else:
                ans += d*(d+1)//2
                d = 1
        ans += d*(d+1)//2
        return ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3


for _ in range(0,int(input())):
    n = int(input())
    arr = list(map(int,input().strip().split()))
    ob=Solution()
    print(ob.numberOfways(arr, n))
    
# } Driver Code Ends