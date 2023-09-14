//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maximumDifferenceSum(A,n));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int maximumDifferenceSum(int arr[], int n) 
	{ 
	    //code here.
	    int s = 0, o = 0;
	    for(int i = 1; i < n; i++){
	        int news = Math.max(s + Math.abs(arr[i] - arr[i - 1]), arr[i] - 1 + o);
	        int newo = Math.max(s + arr[i - 1] - 1, o);
	        s = news;
	        o = newo;
	    }
	    return Math.max(s, o);
	} 

}