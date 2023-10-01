#User function Template for python3
class Solution:
    def isStringExist (self, arr, N, S):
        # code here 
        for i in range(len(arr)):
            x=arr[i]
            if len(x)==len(S):
                c=0
                for j in range(len(x)):
                    if x[j]!=S[j]:
                        c+=1
                if c==1:
                    return True
        return False


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
        arr = input().split()
        S = input()
        ob = Solution()
        print(ob.isStringExist(arr, N, S))
# } Driver Code Ends