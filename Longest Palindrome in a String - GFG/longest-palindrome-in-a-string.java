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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        int cnt=1;int n=S.length();int max=Integer.MIN_VALUE;
        String str="";
        for(int i=0;i<n;i++){
            int left=i-1,right=i+1;
            while(right<n&&S.charAt(i)==S.charAt(right)){
                cnt++;                
                right++;
            }
            while(left>=0&&right<n&&S.charAt(left)==S.charAt(right)){
                cnt+=2;
                left--;
                right++;
            }
            if(cnt>max){
                max=cnt;
                str=S.substring(left+1,right);
            }
            cnt=1;
        }
        return str;
        // code here
        
    }
}