#User function Template for python3

class Solution:
    def isSafe(self,row,col,grid,val):
        for i in range(len(grid)):
            # row check
            if grid[row][i]==val or grid[i][col]==val:
                return False
            if grid[3*(row//3)+i//3][3*(col//3)+i%3]==val:
                return False
        return True
    
    #Function to find a solved Sudoku. 
    def SolveSudoku(self,grid):
        n=len(grid)
        for row in range(0,n):
            for col in range(0,n):
                # cell empty
                if grid[row][col]==0:
                    for val in range(1,10):
                        if self.isSafe(row,col,grid,val):
                            grid[row][col]=val
                            # recursive call 
                            nextSolution=self.SolveSudoku(grid)
                            if nextSolution:
                                return True
                            else:
                                grid[row][col]=0
                    return False
        return True
                        
        
    
    #Function to print grids of the Sudoku.    
    def printGrid(self,arr):
        for i in range(9):
            for j in range(9):
                print(arr[i][j],end=' ')


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=="__main__":
    t = int(input())
    while(t>0):
        grid = [[0 for i in range(9)] for j in range(9)]
        row = [int(x) for x in input().strip().split()]
        k = 0
        for i in range(9):
            for j in range(9):
                grid[i][j] = row[k]
                k+=1
                
        ob = Solution()
            
        if(ob.SolveSudoku(grid)==True):
            ob.printGrid(grid)
            print()
        else:
            print("No solution exists")
        t = t-1
# } Driver Code Ends