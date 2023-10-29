//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
        int b_bit_count = countSetBit(b);
        int val = 0;
        for(int i=0;i<=a;i++){
            val = a ^ i;
            if(countSetBit(val) == b_bit_count){
                return val;
            }
        }
        return val;
    }

    public static int countSetBit(int b){
        int count = 0;
        while(b>0){
            b = b & (b-1);
            count++;
        }
        return count;
    }
}