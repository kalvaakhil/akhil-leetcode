//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            String a1[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[2][N];
            for(int i = 0;i < N; i++)
                mat[0][i] = Integer.parseInt(a[i]);
            for(int i = 0;i < N; i++)
                mat[1][i] = Integer.parseInt(a1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maxSum(N, mat));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
static int maxSum(int n,int mat[][]){
   int prev=0;
        int prev2=Math.max(mat[0][0],mat[1][0]);
        int curr=0;
        for(int i=2;i<=n;i++){
           curr=Math.max(prev2,Math.max(mat[0][i-1],mat[1][i-1])+prev);
           prev=prev2;
           prev2=curr;
        }
        return curr;
    }
}