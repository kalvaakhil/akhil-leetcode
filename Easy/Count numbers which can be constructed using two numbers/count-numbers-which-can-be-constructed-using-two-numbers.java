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
            
            int x = Integer.parseInt(S[0]);
            int y = Integer.parseInt(S[1]);
            int n = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.getCount(x,y,n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//Back-end complete function Template for Java

class Solution {
    static int getCount(int x, int y, int n) {
        // code here
          boolean[] arr=new boolean[n+1];

    if (x <= n)
        arr[x] = true;
    if (y <= n)
        arr[y] = true;

    int result = 0;

    for (int i=Math.min(x, y); i<=n; i++)
    {
        
        if (arr[i])
        {
               
            if (i+x <= n)
                arr[i+x] = true;
            if (i+y <= n)
                arr[i+y] = true;
   
            result++;
        }
    }
    return result;
    }
};