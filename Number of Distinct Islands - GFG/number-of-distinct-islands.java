//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {

    int countDistinctIslands(int[][] grid) {
        HashSet<String> set = new HashSet<>();
        StringBuilder psf;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    psf = new StringBuilder("X");
                    helper(grid,r,c,psf);
                    set.add(psf.toString());
                }
            }
        }
        return set.size();
    }
    void helper(int[][] grid,int r ,int c,StringBuilder psf){
        grid[r][c]=2;
        if(r-1>=0&&grid[r-1][c]==1){
            psf.append("N");
            helper(grid,r-1,c,psf);
        }
        if(c+1<grid[0].length&&grid[r][c+1]==1){
            psf.append("E");
            helper(grid,r,c+1,psf);
        }
        if(r+1<grid.length&&grid[r+1][c]==1){
            psf.append("S");
            helper(grid,r+1,c,psf);
        }
        if(c-1>=0&&grid[r][c-1]==1){
            psf.append("W");
            helper(grid,r,c-1,psf);
        }
        psf.append("z");
    }
}

