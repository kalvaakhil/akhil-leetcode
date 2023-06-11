//{ Driver Code Starts
//Initial Template for Java

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
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.required(a, n, m));
        }
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution {

    public static long required(long a[], long n, long k) {
        // Your code goes here
                long c=0;
        long petrol=0;
        for(long i:a){
            if(i>k  && i>(k+petrol) ){
                petrol=i-k;
                c++;
            }
        }
        if(c==0){
            return -1;
        }
        return petrol;
    }
}