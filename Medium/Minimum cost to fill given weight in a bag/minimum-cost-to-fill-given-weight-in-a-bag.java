//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int w = sc.nextInt();
                    int cost[] = new int[n];
                    for(int i = 0;i<n;i++)
                        cost[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minimumCost(cost,n,w));
                }
        }
}    
// } Driver Code Ends


class Solution
{
    //  ---------- Recursion Solution ---------- 
    int solve(int i, int wt, int[] arr, int n)
    {
        if(i==n || wt<=0)
            return wt==0?0:Integer.MAX_VALUE;
        
        if(arr[i]==-1)
            return solve(i+1,wt,arr,n);
        
        int include = solve(i,wt-i-1,arr,n);
        int exclude = solve(i+1,wt,arr,n);
        
        if(include!=Integer.MAX_VALUE)
            include += arr[i];
         
        return Math.min(include,exclude);
    }
    //  ---------- Memorization Solution ---------- 
    int solveMem(int i, int wt, int[] arr, int n, Integer[][] dp)
    {
        if(i==n || wt<=0)
            return wt==0?0:Integer.MAX_VALUE;
        
        if(arr[i]==-1)
            return dp[i][wt] = solveMem(i+1,wt,arr,n,dp);
            
        if(dp[i][wt]!=null)
            return dp[i][wt];
            
        int include = solveMem(i,wt-i-1,arr,n,dp);
        int exclude = solveMem(i+1,wt,arr,n,dp);
        
        if(include!=Integer.MAX_VALUE)
            include += arr[i];
         
        return dp[i][wt] = Math.min(include,exclude);
    }
    //  ---------- Tabulation Solution ---------- 
    int tabulation(int[] arr, int n, int W)
    {
        int[][] dp = new int[n+1][W+1];
        
        for(int i=n; i>=0; i--)
        {
            for(int wt=0; wt<=W; wt++)
            {
                if(i==n || wt==0)
                    dp[i][wt] = wt==0?0:Integer.MAX_VALUE;
                
                else if(arr[i]==-1)
                    dp[i][wt] = dp[i+1][wt];
                
                else
                {
                    int include = (wt>=i+1) ? dp[i][wt-i-1]:Integer.MAX_VALUE;
                    int exclude = dp[i+1][wt];
                    
                    if(include!=Integer.MAX_VALUE)
                        include += arr[i];
                     
                    dp[i][wt] = Math.min(include,exclude);
                }
            }
        }
        return dp[0][W];
    }
    //  ---------- O(N) DP ---------- 
    int spaceOPT(int[] arr, int n, int W)
    {
        // int[][] dp = new int[n+1][W+1];
        int[] curr = new int[W+1];
        int[] next = new int[W+1];
        
        for(int i=n; i>=0; i--)
        {
            for(int wt=0; wt<=W; wt++)
            {
                if(i==n || wt==0)
                    curr[wt] = wt==0?0:Integer.MAX_VALUE;
                
                else if(arr[i]==-1)
                    curr[wt] = next[wt];
                
                else
                {
                    int include = (wt>=i+1) ? curr[wt-i-1]:Integer.MAX_VALUE;
                    int exclude = next[wt];
                    
                    if(include!=Integer.MAX_VALUE)
                        include += arr[i];
                     
                    curr[wt] = Math.min(include,exclude);
                }
            }
            next = curr.clone();
        }
        return next[W];
    }
	public int minimumCost(int cost[], int N,int W)
	{
	   // ---------- Recursion ---------- 
	   // int ans = solve(0,W,cost,N);	
	    
	   //  ---------- Memorization ---------- 
	   //Integer[][] dp = new Integer[N][W+1];
	   //int ans = solveMem(0,W,cost,N,dp);
	   
	   // ---------- Tabulation  ---------- 
	   //int ans = tabulation(cost,N,W);
	   
	   // ---------- O(N) DP ---------- 
	   int ans = spaceOPT(cost,N,W);
	   
	   return ans==Integer.MAX_VALUE?-1:ans;
	}
}