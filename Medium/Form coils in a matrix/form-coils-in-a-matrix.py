#User function Template for python3
class Solution:
    def formCoils(self, n):
        def solve1(mat,r,c):
            arr1=[]
            t=0
            b=r-1
            l=0
            r=c-1
            # dir=0 for right to left
            # dir=1 for top to bottom
            # dir=2 for   left to right
            # dir=3 for bottom to top
            #initially top to botttom
            dir=1
            while t<=b and l<=r:
                if dir==1:
                    for i in range(t,b+1):
                        arr1.append(mat[i][l])
                    l+=1
                    dir=0
                if dir==0:
                    for i in range(l,r):
                        arr1.append(mat[b][i])
                    l+=1
                    b-=1
                    r-=1
                    dir=3
                if dir==3:
                    for i in range(b,t,-1):#may be +1
                        arr1.append(mat[i][r])
                    dir=2
                    r-=1
                    # l+=1
                if dir==2:
                    for i in range(r,l-1,-1):
                        arr1.append(mat[t+1][i])
                    dir=1
                    t+=2
                    b-=1
            return arr1
        def solve2(mat,r,c):
            arr1=[]
            t=0
            b=r-1
            l=0
            r=c-1
            # dir=0 for right to left
            # dir=1 for top to bottom
            # dir=2 for   left to right
            # dir=3 for bottom to top
            #initially top to botttom
            dir=3
            while t<=b and l<=r:
                if dir==3:
                    for i in range(b,t-1,-1):#may be +1
                        arr1.append(mat[i][r])
                    dir=0
                    
                    r-=1
                if dir==0:
                    for i in range(r,l,-1):
                        arr1.append(mat[t][i])
                    l+=1
                    t+=1
                    dir=1
        
                    # l+=1
                if dir==1:
                    for i in range(t,b):
                        arr1.append(mat[i][l])
                    b-=1
                    l+=1
                    dir=2
                if dir==2:
                    for i in range(l,r):
                        arr1.append(mat[b][i])
                    dir=3
                    t+=1
                    r-=1
                    b-=1
            return arr1
        # n=2
        r=4*n
        c=4*n
        k=1
        mat=[]
        for i in range(1,r+1):
            arr=[]
            for j in range(1,c+1):
                arr.append(k)
                k+=1
            mat.append(arr)
        return solve2(mat,r,c)[::-1], solve1(mat,r,c)[::-1]



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        n=int(input())
        
        ob = Solution()
        ptr = ob.formCoils(n)
        
        for i in range(2):
            print(*ptr[i])
# } Driver Code Ends