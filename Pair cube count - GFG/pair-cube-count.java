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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.pairCubeCount(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
static int pairCubeCount(int N) {
    int count = 0;
    for (int a = 1; a*a*a <= N; a++) {
        int b = (int) Math.cbrt(N - a*a*a);
        if (a*a*a + b*b*b == N) { 
            count++;
        }
    }
    return count;
    }
};