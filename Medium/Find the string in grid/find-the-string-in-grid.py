#User function Template for python3

class Solution:
	def searchWord(self, grid, word):
		n = len(grid)       # length of row
		m = len(grid[0])    # length of column
		
		x_dir = [1,0,-1,0,1,1,-1,-1]
		y_dir = [0,1,0,-1,-1,1,1,-1]
		
		def solve(r, c, x, y, ind):
		    if ind == len(word): return True
		    row = r+x           # Current row index i.e. ( i + x_dir[k] )
		    col = c+y           # Current row index i.e. ( j + y_dir[k] )
		    
		    if row < 0 or col < 0 or row >= n or col >= m or grid[row][col] != word[ind]:
		        return False
		    
		    if solve(row, col, x, y, ind+1):
		        return True
		    return False
		
		ans = set()
		for i in range(n):
		    for j in range(m):
		        if grid[i][j] == word[0]:   # First char of word i.e. word[0] mathches
		            for k in range(8):      # Traverse all eight directions
		                if solve(i, j, x_dir[k], y_dir[k], 1):
		                    ans.add((i, j))
		                    break
		return sorted(ans)          # Return the co-ordinates in lexicographical order


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n, m = input().split()
		n = int(n); m = int(m);
		grid = []
		for _ in range(n):
			cur  = input()
			temp = []
			for __ in cur:
				temp.append(__)
			grid.append(temp)
		word = input()
		obj = Solution()
		ans = obj.searchWord(grid, word)
		for _ in ans:
			for __ in _:
				print(__, end = " ")
			print()
		if len(ans)==0:
		    print(-1)

# } Driver Code Ends