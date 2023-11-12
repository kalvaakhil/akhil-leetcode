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
            String[] inp = read.readLine().split(" ");
            int x = Integer.parseInt(inp[0]);
            int y = Integer.parseInt(inp[1]);
            
            String s = read.readLine();
            
            Solution ob = new Solution();
            
            
            System.out.println(ob.arrangeString(s, x, y));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
public String arrangeString(String str, int x, int y)
    {
        //complete the function here 
        //count number of one and zeroes in the string
        int zerosCount = 0,onesCount=0;
        int n =str.length();
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='0'){
                zerosCount++;
            }else{
                onesCount++;
            }
        }
        StringBuilder sb = new StringBuilder();
        int j=0;
        while(zerosCount>0 || onesCount>0){
            for(int i=0; i<x && zerosCount>0; i++){
                if(zerosCount>0){
                    sb.insert(j,'0');
                    j++;
                    zerosCount--;
                }
            }
            for(int i=0; i<y && onesCount>0; i++){
                if(onesCount>0){
                    sb.insert(j,'1');
                    j++;
                    onesCount--;
                }
            }
        }
        return sb.toString();
    }
}
