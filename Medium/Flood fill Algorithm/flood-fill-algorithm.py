class Solution:
    def floodFill(self, image, sr, sc, newColor):
        
        def dfs(row,col,ans,image,newColor,initalcolor,delrow,delcol):
            ans[row][col] = newColor
            for i in range(4):
                
                nrow = row + delrow[i]
                ncol = col + delcol[i]
                
                if nrow>=0 and ncol>=0 and  nrow <len(image) and ncol < len(image[0]) and image[nrow][ncol]==initalcolor and ans[nrow][ncol]!=newColor:
                    dfs(nrow,ncol,ans,image,newColor,initalcolor,delrow,delcol)
        
        
        initalcolor = image[sr][sc]
        ans = image[::]
        delrow = [-1, 0, +1, 0]
        delcol = [0, +1, 0, -1]
        dfs(sr,sc,ans,image,newColor,initalcolor,delrow,delcol)
        return ans



#{ 
 # Driver Code Starts
import sys
sys.setrecursionlimit(10**7)


T=int(input())
for i in range(T):
	n, m = input().split()
	n = int(n)
	m = int(m)
	image = []
	for _ in range(n):
		image.append(list(map(int, input().split())))
	sr, sc, newColor = input().split()
	sr = int(sr); sc = int(sc); newColor = int(newColor);
	obj = Solution()
	ans = obj.floodFill(image, sr, sc, newColor)
	for _ in ans:
		for __ in _:
			print(__, end = " ")
		print()
# } Driver Code Ends