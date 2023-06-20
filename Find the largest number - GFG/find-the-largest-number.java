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
            System.out.println(ob.find(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean getNum(int n){
        int prev=n%10;
        n/=10;
        boolean flag=true;
        while(n>0){
            int x=n%10;
            if(x>prev)
            {
                flag=false;
                break;
            }
            prev=x;
            n/=10;
        }
        return flag;
    }
    static int find(int N){
        // code here  
        while(true){
            if(getNum(N)){
                return N;
            }
            N-=1;
        }
    }
}