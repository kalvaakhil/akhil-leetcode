//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int m = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);
            int a = Integer.parseInt(S[2]);
            int b = Integer.parseInt(S[3]);

            Solution ob = new Solution();
            System.out.println(ob.numOfDiv(m,n,a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numOfDiv(int m, int n, int a, int b) {
        // code here
        int count = 0;
       for(int i = m ; i <= n ; i++)
       {
           if(i%a == 0 || i%b == 0)
           {
               count++;
           }
       }
       return count;


    }
};