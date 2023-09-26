//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int X = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.closest3Sum(Arr, N, X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int closest3Sum(int arr[], int N, int X)
    {
        // code here
        int ans=0,dif=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<N-2;i++)
        {
            int sum=0;
            int j=i+1,k=N-1;
            
            while(j<k)
            {
                sum=arr[i]+arr[j]+arr[k];
                //if()
                if(Math.abs(X-sum)<dif)
                {
                    ans=sum;
                    dif=Math.abs(X-sum);
                }
                
                if(sum<X)
                {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
}