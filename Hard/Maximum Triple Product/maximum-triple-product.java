//{ Driver Code Starts
//Initial Template for Javaimport java.io.*;

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            long x = ob.maxProductSum(N, arr);
            System.out.println(x);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    long maxProductSum(int N, int nums[])
    {
        // code here
         long[][] dp = new long[nums.length][nums.length];
        
        for(int g = 0 ; g < dp.length ; g++){
            for(int i = 0 , j = g ; j < dp.length ; i++,j++){
                
                for(int k = i ; k <= j ; k++ ){
                    long left = (k==i ? 0 : dp[i][k-1]);
                    long right = (k==j ? 0 : dp[k+1][j]);
                    long w = (i==0 ? 1 : nums[i-1]) * (long)nums[k] * (j==dp.length-1 ? 1:nums[j+1]);
                    dp[i][j] = Math.max(dp[i][j],left+right+w);
                }
                    
            }
        }
        return dp[0][dp.length-1];
    }
}