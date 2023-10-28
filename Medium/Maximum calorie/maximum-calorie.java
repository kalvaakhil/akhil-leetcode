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
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxCalories(Arr,n));
                }
        }
}    
// } Driver Code Ends




class Solution
{
public int maxCalories(int arr[], int n)
{
        int sum[] = new int[n];
        if (n >= 1)
            sum[0] = arr[0];
 
        if (n >= 2)
            sum[1] = arr[0] + arr[1];
 
        if (n > 2)
            sum[2] = Math.max(sum[1], Math.max(arr[1] + arr[2], arr[0] + arr[2]));

        for (int i = 3; i < n; i++){
            sum[i] = Math.max(Math.max(sum[i - 1], sum[i - 2] + arr[i]),
                              arr[i] + arr[i - 1] + sum[i - 3]);
        }
        return sum[n - 1];
}
}