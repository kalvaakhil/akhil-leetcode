//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] prices = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.stockBuyAndSell(n, prices);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int fun(int[] arr,int[][] dp,int n,int i,int pos){
        if(i>=n)
            return 0;
        if(dp[i][pos]!=-1)  
            return dp[i][pos];
        int buy = 0 , sell = 0 , both = 0 , nothing = 0;
        if(pos==0){
            buy = -arr[i] + fun(arr,dp,n,i+1,1);
            both = fun(arr,dp,n,i+1,0);
        }
        if(pos==1){
            sell = arr[i] + fun(arr,dp,n,i+1,0);
            both = fun(arr,dp,n,i+1,1);
        }
        nothing = fun(arr,dp,n,i+1,pos);
        return dp[i][pos] = Math.max(both,Math.max(nothing,Math.max(buy,sell)));
    }
    public static int stockBuyAndSell(int n, int[] prices) {
        int[][] dp = new int[n+1][2];
        for(int i=0; i<=n; i++){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        return fun(prices,dp,n,0,0);
    }
}     
