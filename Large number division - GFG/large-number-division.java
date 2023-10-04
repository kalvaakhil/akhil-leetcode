//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();
            int d = Integer.parseInt(read.readLine().trim());
            Solution ob = new Solution();
            System.out.println(ob.longDivision(s, d));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   String longDivision(String S, int D){
       // code here
       StringBuilder ans = new StringBuilder("");
 StringBuilder quot = new StringBuilder("");
   
 for(int i=0; i<S.length(); i++) {
  quot.append(S.charAt(i));
  int num = Integer.parseInt(quot.toString());
  
  if(num >= D) {    
   ans.append((int)(num/D));
   quot.setLength(0);
   quot.append(num%D);
  }
  else if(ans.length() > 0){    
   ans.append("0");
  }
 }
 
 return (ans.length() == 0) ? "0" : ans.toString();
       
   }
}