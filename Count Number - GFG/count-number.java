//{ Driver Code Starts
//Initial Template for Java

import java.math.BigInteger;
import java.util.*;
import java.io.*;

class GfG
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long arr[] = new long[(int)(n + 1)];
            for(int i = 1;i <= n;i++){
                arr[i] = sc.nextLong();
            }
            
            Compute obj =  new Compute();
            System.out.println( obj.getAnswer( arr, n, k, x) );
            T--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Compute
{
   static long mod = (long)1E9 + 7;
   static long fac[];
   static long invfac[];
   static long modpow(long n,long k)
   {
       long den = invfac[(int)(k)]*invfac[(int)(n - k)] % mod;
       return den * fac[(int)(n)] % mod;
   }
       
   public static long getAnswer(long arr[], long n, long k, long x){
       
       Arrays.sort(arr);  
       int left = 1;
       long ans = 0;
       fac = new long[1000000 + 5];
       fac[1] = fac[0] = 1;
       
       for (int i = 2; i < fac.length; i++){
           fac[i] = i*fac[i - 1];
           fac[i] %= mod;
       }
       invfac = new long[1000000 + 5];
       invfac[fac.length - 1] = BigInteger.valueOf(fac[fac.length - 1]).modInverse(BigInteger.valueOf(mod)).longValue();
       
       for(int i = fac.length - 2;i >= 0;i--){
           invfac[i] = invfac[i + 1]*(i + 1) % mod;
       }
       
       for(int i = 1;i <= n;i++)
       {
           while(arr[i] - arr[left] > x) ++left;
           if(i - left < k - 1) continue;
           ans += modpow(i - left, k - 1);
       }
       
       return (ans%mod);
   }
}

