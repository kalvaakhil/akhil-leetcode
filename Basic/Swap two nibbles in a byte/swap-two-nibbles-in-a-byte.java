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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int swapNibbles(int n) {
        //code here
                int t1=n&15;
        int t2=t1<<4;
        int t3=n>>4;
        int ans=t2+t3;
        return(ans);
    }
}