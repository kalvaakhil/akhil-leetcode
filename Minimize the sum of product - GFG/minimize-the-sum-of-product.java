//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.minValue(a, b, n));
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {

  public static long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        
        long res =0L;
        Arrays.sort(a);
        Arrays.sort(b);
        
        for (int i=0; i<n/2; i++) {
            
        if (i != (n-i-1L))
            res = res + ((a[i]*b[(int) (n-i-1L)]) + (b[i]*a[(int) (n-i-1L)]));
        }
        
        if (n%2 != 0)
            res = res + (a[(int) (n/2)]*b[(int) (n/2)]);
        return res;
    }


}