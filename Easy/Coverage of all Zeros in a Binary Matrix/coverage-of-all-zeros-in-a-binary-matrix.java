//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().split(" ");
                for(int j = 0; j < m; j++){
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.FindCoverage(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    public static boolean check(int i, int j, int N, int M, int [][] matrix){
        return (i < N && j < M && i >= 0 && j >= 0 && matrix[i][j] == 1);
    }
    public int FindCoverage(int[][] matrix){
        // code here
        int x[] = {0, 0, -1, 1};
        int y[] = {-1, 1, 0, 0};
        int N = matrix.length;
        int M = matrix[0].length;
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(matrix[i][j] == 0){
                    for(int a = 0; a < x.length; a++){
                        if(check(i+x[a], j+y[a], N, M, matrix)){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}