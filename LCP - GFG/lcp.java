//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.math.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(sc.next());
            
            String s[] = new String[n];
            for(int i=0;i<n;i++)
            {
                s[i] = sc.next();
            }
            Solution T = new Solution();
            System.out.println(T.lcp(s,n));
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
 public String lcp(String s[],int n)
    {
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[n-1];
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }
        }
        
        return sb.length() == 0 ? "-1": sb.toString();
    }
}
