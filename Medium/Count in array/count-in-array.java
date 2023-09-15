//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
   static int mod=(int)1e9+7;
  static  int dp1[][]=new int [101][101];
   static int solve(int[]dp,int m,int n,int p)
   {
       if(n==0)
       {
           
           return 1 ;
       }
       if(dp1[n][p]!=-1)
       return dp1[n][p];
       int ans=0;
       for(int i=0;i<m;i++)
       {
           if(p==0)
            ans=(ans%mod+ solve(dp,m,n-1,dp[i])%mod)%mod;
          else
          {
              if(p%dp[i]==0||dp[i]%p==0)
            ans=(ans%mod+ solve(dp,m,n-1,dp[i])%mod)%mod;
          }
           
       }
       return dp1[n][p]= ans%mod;
       
   }
   static int count(int N,int M)
   {
       int []dp=new int[M];
       for(int i=0;i<M;i++)
       {
           dp[i]=i+1;
       }
       for(int i=0;i<101;i++)
       {
           Arrays.fill(dp1[i],-1);
       }
      return  solve(dp,M,N,0)%mod;
      
       
   }
}
 

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.count(N,M));
        }
    }
}
// } Driver Code Ends