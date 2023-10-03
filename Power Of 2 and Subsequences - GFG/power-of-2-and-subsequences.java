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
            ArrayList<Long> A = new ArrayList<Long>();
            String in[] = read.readLine().trim().split(" ");
            for(var i : in){
                Long x = Long.parseLong(i);
                A.add(x);
            }

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(N,A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
  static Long numberOfSubsequences(int N, ArrayList<Long> A){
        // code here
        long count = 0;
        for(int i=0;i<N;i++){
// if the current the num is power of two then if we take & with num-1 is gives 0;
            if((A.get(i)&A.get(i)-1)==0){
                count++;
            }
        }
// to find the count of number of subsequence it is given by the equation 2^count - 1;
        return (long)(Math.pow(2,count)%1000000007-1)%1000000007;
    }
}