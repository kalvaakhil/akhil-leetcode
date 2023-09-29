//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        
         n=grid.length;
         m=grid[0].length;
        
        boolean[][] vis=new boolean[n][m];
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0 || j==0 || i==n-1 || j==m-1) && vis[i][j]==false && grid[i][j]==1)
                {
                    DFS(i,j,vis,grid);
                }
            }
        }
        
        int res=0;
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==false && grid[i][j]==1)
                {
                    res++;
                }
            }
        }
        
        return res;
        
        
    }
    
    public static int n;
    public static int m;
    
    public static void DFS(int i,int j,boolean[][] vis,int[][] grid)
    {
        
        vis[i][j]=true;
        
        
        if(i+1<n && grid[i+1][j]==1 && vis[i+1][j]==false)
        {
            DFS(i+1,j,vis,grid);
        }
        
        if(j+1<m && grid[i][j+1]==1 && vis[i][j+1]==false)
        {
            DFS(i,j+1,vis,grid);
        }
        
        if(i-1>=0 && grid[i-1][j]==1 && vis[i-1][j]==false)
        {
            DFS(i-1,j,vis,grid);
        }
        
        if(j-1>=0 && grid[i][j-1]==1 && vis[i][j-1]==false)
        {
            DFS(i,j-1,vis,grid);
        }
        
        
    }
    
    
    
}