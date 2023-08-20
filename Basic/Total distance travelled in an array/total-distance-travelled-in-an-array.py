#User function Template for python3

class Solution:
    def distance(self, arr, n):
        # code here
        di={}
        for i in range(n):
            di[arr[i]]=i
        su=0
        for i in range(1,n):
            su+=abs(di[i]-di[i+1])
            #print(di[i],di[i+1])
        return su


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.distance(arr, n)
        print(ans)
        tc -= 1

# } Driver Code Ends