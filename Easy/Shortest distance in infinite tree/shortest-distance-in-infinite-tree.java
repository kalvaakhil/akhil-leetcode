//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
static int distance(int X,int Y) {
       if(X == Y) return 0;
       int m = X;
       int n = Y;
       int count = 0;
       
       while(m != n) {
           if(m > n) {
               m = m/2;
           } else {
               n = n/2;
           }
           count++;
       }
       
       return count;
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
            int X = Integer.parseInt(S[0]);
            int Y = Integer.parseInt(S[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.distance(X,Y));
        }
    }
}
// } Driver Code Ends