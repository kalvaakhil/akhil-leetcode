//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            String A = S[0];
            String B = S[1];

            Solution ob = new Solution();
            System.out.println(ob.karatsubaAlgo(A,B));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
static Long karatsubaAlgo(String A, String B) {

        // code here

        long a=convert(A);

        long b=convert(B);

        

        Long ss=new Long(a*b);

        

        return ss;

    }

    public static long convert(String a)

    {

        long ans=0;

        long v=0;

        for(int i=a.length()-1; i>=0; i--)

        {

            long k=(int)a.charAt(i)-48;

            ans+=(long)Math.pow(2,v++)*k;

            

        }

        return ans; 

 

    }
};