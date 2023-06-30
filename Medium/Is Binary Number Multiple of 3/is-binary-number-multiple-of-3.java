//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine().trim());
            while(t-->0)
                {
                    String s = in.readLine().trim();
                    Solution ob = new Solution();
                    out.println(ob.isDivisible(s));
                }
                out.close();
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isDivisible(String s) {
        // code here
        int even = 0;
        int odd = 0;
        for(int i = 0; i <s.length(); i++)
        {
            char ch = s.charAt(i);
            int n = ch - '0';
            
            if(i % 2 == 0)
            {
                even += n;
            }
            else
            {
                odd += n;
            }
        }
        
        int decimal  = odd - even;
        
        if(decimal % 3 == 0) return 1;
        else return 0;
    }
}
