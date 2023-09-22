#User function Template for python3


class Solution:
    def find(self, arr, n, x):
            
            # code here
            left = 0
            right = n-1
    
            while left<=right:
                if arr[left]<x:
                    left+=1
                if arr[right]>x:
                    right-=1
                if arr[left]==x and arr[right]==x:
                    return [left, right]
            
            return [-1, -1]


#{ 
 # Driver Code Starts
t=int(input())
for _ in range(0,t):
    l=list(map(int,input().split()))
    n=l[0]
    x=l[1]
    arr=list(map(int,input().split()))
    ob = Solution()
    ans=ob.find(arr,n,x)
    print(*ans)
# } Driver Code Ends