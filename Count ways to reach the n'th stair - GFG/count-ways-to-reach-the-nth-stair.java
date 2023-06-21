//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        int [] dp = new int[n+1];
        if(n<=2)return n%1000000007;
        dp[1]=1;
        dp[2]=2;
        
        for(int i = 3  ; i < n+1 ; i ++)
        {
            dp[i]=(dp[i-1]%1000000007)+(dp[i-2]%1000000007);
        }
        //System.out.println(dp[n]);
        return dp[n]%1000000007;
    }
}

