#User function Template for python3

class Solution:
    def findK(self, a, n, m, k):
        # Write Your Code here
        right = m-1
        bottom = n-1
        top = 0
        left = 0
        arr = []
        while left <= right and top <= bottom:
            for i in range(left, right+1):
                arr.append(a[top][i])
            top += 1
            # print(arr)
            for i in range(top, bottom+1):
                arr.append(a[i][right])
            right -= 1
            # print(arr)
            for i in range(right, left-1, -1):
                arr.append(a[bottom][i])
            bottom -= 1
            # print(arr)
            for i in range(bottom, top-1, -1):
                arr.append(a[i][left])
            left += 1
        # print(arr)
        return arr[k-1]


#{ 
 # Driver Code Starts

#Initial Template for Python 3

for _ in range(int(input())):
    n, m, k = map(int,input().split())
    a = [
            list(map(int,input().split()))
            for _ in range(n)
        ]
    
    ob = Solution()
    print(ob.findK(a,n,m,k))
    
# } Driver Code Ends