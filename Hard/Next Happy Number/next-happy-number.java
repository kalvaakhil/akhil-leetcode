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
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int nextHappy(int N){
        int sum=0;
        int temp=0;
        int digit=0;
        while(sum!=1){
            N++;
            sum=N;
            for(int i=0;i<1000;i++){
                if(sum>1){
                    temp=sum;
                    sum=0;
                    while(temp!=0){
                        digit=temp%10;
                        sum=sum+digit*digit;
                        temp=temp/10;
                    }
                }
                else{
                    return N;
                }
            }
        }
        return 0;
    }
}