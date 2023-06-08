//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static void func(int[][] m,int n,ArrayList<String>path, String s, int [][]vis,int i,int j){
        if(i<0||j<0||i>=n||j>=n)return ;
        if(m[i][j]==0||vis[i][j]==1)return;
        if(i==n-1&&j==n-1){
            path.add(s);
            return;
        }
        vis[i][j]=1;
         func(m,n,path,s+"R",vis,i,j+1);
          func(m,n,path,s+"L",vis,i,j-1);
           func(m,n,path,s+"D",vis,i+1,j);
            func(m,n,path,s+"U",vis,i-1,j);
            
              vis[i][j] = 0 ; 
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        
        ArrayList<String>path=new ArrayList<String>();
        
        int vis[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
         if(m[0][0]==0){
            return path ; 
        } 
        if(m[n-1][n-1]==0){
            return path ; 
        }
        
        String s="";
        func(m,n,path,s,vis,0,0);
        return path;
    }
}