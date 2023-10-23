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
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{
	    int[] dp = new int[n];
	    int ans = Integer.MIN_VALUE;
	    for(int idx=0; idx<n; idx++) dp[idx] = arr[idx];
	    
	    for(int idx1=0; idx1<n; idx1++) {
	        for(int idx2=0; idx2<idx1; idx2++) {
	            if(arr[idx1]>arr[idx2]) dp[idx1] = Math.max(dp[idx2]+arr[idx1], dp[idx1]);
	        }
	        ans = Math.max(ans, dp[idx1]);
	    }
	    return ans;
	}
}