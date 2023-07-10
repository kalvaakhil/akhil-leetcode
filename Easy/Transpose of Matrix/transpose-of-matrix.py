#User function Template for python3

#Back-end complete function Template for Python 3
class Solution:
    def transpose(self,matrix, n):
        for i in range(n):
            for j in range(i+1,n):
                temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
        return matrix

        # z=list(zip(*matrix))
        # m=[[0]*n]*n
        # for i in range(n):
        #     for j in range(n):
        #         m[i][j]=z[i][j]
        # matrix[:]=m[:]
            
            



#{ 
 # Driver Code Starts

#Initial Template for Python 3

for _ in range(int(input())):
    n = int(input())
    matrix = [
            list(map(int,input().split()))
            for _ in range(n)
        ]
        
    ob = Solution()
    ob.transpose(matrix, n)
    
    for row in matrix:
        print(*row)
    
# } Driver Code Ends