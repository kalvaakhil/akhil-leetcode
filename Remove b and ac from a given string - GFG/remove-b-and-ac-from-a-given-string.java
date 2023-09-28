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
            String s = read.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.stringFilter(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public String stringFilter(String str) 
    {
        

         //It will remove the ac from the string
         String r=str.replace("ac","");

         // it will remove the b 
        String t=r.replace("b","");
       
        return t;
    }
}