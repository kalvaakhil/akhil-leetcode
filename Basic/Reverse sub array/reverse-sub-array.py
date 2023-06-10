#User function Template for python3
class Solution:
 
    def reverseSubArray(self,arr, n, l, r):
        first = arr[:l-1]
        mid = arr[l-1:r][::-1]
        fin = arr[r:]
        arr[::] = first+mid+fin
        return arr


#{ 
 # Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        l, r = list(map(int, input().strip().split()))
        ob = Solution()
        ob.reverseSubArray(arr, n, l, r)
        for x in arr:
            print(x, end=" ")
        print()
        tc -= 1

# } Driver Code Ends