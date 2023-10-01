#User function Template for python3

class Solution:
    def sortedCount(self,N,M,Mat):
        #code here
        count=0
        for i in Mat:
            if (i==sorted(i) or i==sorted(i,reverse=True)) and len(set(i))==len(i):
                count+=1
        return count


        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        N,M=map(int,input().strip().split(" "))
        Mat=[]
        for i in range(N):
            Mat.append(list(map(int,input().strip().split(" "))))
        ob=Solution()
        ans=ob.sortedCount(N,M,Mat)
        print(ans) 
# } Driver Code Ends