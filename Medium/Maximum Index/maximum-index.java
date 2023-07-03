//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

int maxIndexDiff(int arr[], int n) {
        // code here
        int lmin[]=new int[n];
        int rmax[]=new int[n];
        lmin[0] = arr[0];
        rmax[n-1] = arr[n-1];
        for(int i = 1; i < n; i++)
        {
            lmin[i] = Math.min(lmin[i-1], arr[i]);
            rmax[n-i-1] = Math.max(rmax[n-i], arr[n-i-1]);
        }
        int i=0, j=0 ;
        int maxDiff = 0;
        while(i < n && j < n)
        {
            if(lmin[i] <= rmax[j])
            {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            }
            else
                i++;
        }
        return maxDiff;
    }
}