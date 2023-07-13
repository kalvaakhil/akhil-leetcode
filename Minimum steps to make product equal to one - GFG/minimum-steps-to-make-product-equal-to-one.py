#User function Template for python3

class Solution:
    def makeProductOne(self, arr, N):
        # code here 
        res=0
        new_arr=[]
        prod=1
        for i in arr:
            prod*=i
            new_arr.append(abs(i))
        
        for i in new_arr:
            res+=abs(i-1)
        

# If original product of array is -ve, we add 2 more steps
        if prod<0:
            res+=2
            
        return res


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        arr=list(map(int,input().split()))
        
        ob = Solution()
        print(ob.makeProductOne(arr,N))
# } Driver Code Ends