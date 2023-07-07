//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int r = grid.length;
        int c = grid[0].length;
        int count =0;
        boolean vis[][] = new boolean[r][c];
        for(int i=0;i<r;i++)
        {
             for(int j=0;j<c;j++)
             {
                 if(!vis[i][j] && grid[i][j]=='1')
                 {
                     count++;
                     dfs(i,j,r,c,vis,grid);
                 }
             }
        }
        return count;
    }
    
    void dfs(int i,int j,int r,int c,boolean vis[][],char[][]grid)
    {
        vis[i][j]=true;
        
        int[] delRow={0,0,1,-1,1,1,-1,-1};
        int[] delCol={1,-1,0,0,1,-1,-1,1};
        
        for(int id=0;id<8;id++)
        {
            int adjrow=i+delRow[id];
            int adjcol=j+delCol[id];
            
            if(adjrow>=0 && adjrow<r && adjcol>=0 && adjcol<c && vis[adjrow][adjcol]==false && grid[adjrow][adjcol]=='1')
            {
             dfs(adjrow,adjcol,r,c,vis,grid);   
            }
        }
    }
}