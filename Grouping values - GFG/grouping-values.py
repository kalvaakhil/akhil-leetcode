#User function Template for python3

class Solution:
    def isPossible(self, N, arr, K):
        # code here
        b = set(arr)
        f = 0
        for i in b:
            if arr.count(i)>2*K:
                f = 1
                break
            else:
                continue
        if f==1:
            return 0
        else:
            return 1

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
        arr = input().split()
        for itr in range(N):
            arr[itr] = int(arr[itr])
        K = int(input())

        ob = Solution()
        print(ob.isPossible(N, arr, K))

# } Driver Code Ends