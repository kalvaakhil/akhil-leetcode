//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    // ---------- Recursion Solution ---------- 
    int solveRec(int i, int reach, int[] arr, int n)
    {
        if(i==n)
            return 0;
        
        if(reach>0)
        {
            int include = arr[i] + solveRec(i+1,reach-1,arr,n);
            int exclude = 0 + solveRec(i+1,2,arr,n);
            
            return Math.max(include,exclude);
        }
        
        return solveRec(i+1,2,arr,n);
    }
    //  ---------- Memorization Solution ---------- 
    int solveMem(int i, int reach, int[] arr, int n, Integer[][] dp)
    {
        if(i==n)
            return 0;
        
        if(dp[i][reach]!=null)
            return dp[i][reach];
            
        if(reach>0)
        {
            int include = arr[i] + solveMem(i+1,reach-1,arr,n,dp);
            int exclude = 0 + solveMem(i+1,2,arr,n,dp);
            
            return dp[i][reach] = Math.max(include,exclude);
        }
        
        return dp[i][reach] = solveMem(i+1,2,arr,n,dp);
    }
    //  ---------- Space Optimized DP ---------- 
    int solveTab(int[] arr, int n)
    {
        // int[][] dp = new int[1000000+1][3];
        int[] curr = new int[3];    // dp[i][x]
        int[] next = new int[3];    // dp[i+1][x]

        for(int i=n-1;i>=0;i--)
        {
            for(int reach=0;reach<3;reach++)
            {
                if(reach>0)
                {
                    int include = arr[i] + next[reach-1];
                    int exclude = 0 + next[2];
                    
                    curr[reach] = Math.max(include,exclude);
                }
                else
                    curr[reach] = next[2];
            }
            next = Arrays.copyOf(curr, 3);
        }
        return curr[2];
    }
    int findMaxSum(int arr[], int n) {
        //  ---------- Recursion ---------- 
        // return solveRec(0,2,arr,n);
        
        //  ---------- Memorization ---------- 
        // Integer[][] dp = new Integer[n][3];
        // return solveMem(0,2,arr,n,dp);
        
        //  ---------- Dp O(1)  ---------- 
        return solveTab(arr,n);
    }
}