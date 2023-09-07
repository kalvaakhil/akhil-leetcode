#User function Template for python3

class Solution:
    def helpaterp(self, arr):
        n=len(arr)
        m=len(arr[0])
        queue=[]
        for i in range(n):
            for j in range(m):
                if arr[i][j]==2:
                    queue.append([0,i,j])
        
        vis=[[0 for i in range(m)]for j in range(n)]
        delrow=[-1,0,1,0]
        delcol=[0,1,0,-1]
        while queue:
            a=queue.pop(0)
            steps=a[0]
            row=a[1]
            col=a[2]
            vis[row][col]=1
            arr[row][col]=2
            for i in range(4):
                nr=delrow[i]+row
                nc=delcol[i]+col
                if nr>=0 and nr<n and nc>=0 and nc<m and arr[nr][nc]==1 and vis[nr][nc]==0:
                    queue.append([steps+1,nr,nc])
                    
        for i in range(n):
            for j in range(m):
                if arr[i][j]==1:
                    return -1
        return steps
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3


if __name__ == '__main__':
    t=int(input())
    for tcs in range(t):
        
        rc=input().split() #row and column
        r=int(rc[0])    
        c=int(rc[1])
        
        
        hospital=[]
        
        for i in range(r):
            hospital.append([int(j) for j in input().split()])
            
        ob = Solution()        
        print(ob.helpaterp(hospital))

# } Driver Code Ends