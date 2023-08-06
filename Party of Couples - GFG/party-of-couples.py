#User function Template for python3

class Solution:
    def findSingle(self, N, arr):
        # code here
        fre={}
        for i in arr:
            if i not in fre:
                fre[i]=1
            else:
                fre[i]+=1
        for key,value in fre.items():
            if value==1:
                return key


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
        
        ob = Solution()
        print(ob.findSingle(N, arr))

# } Driver Code Ends