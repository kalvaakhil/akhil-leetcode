//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int l = Math.max(-1, k - m - 1);
        int r = Math.min(k - 1, n - 1);
        
        while (true)
        {
            int index1 = l + (r - l) / 2;
            int index2 = k - index1 - 2;
            
            int left1 = index1 == -1 ? Integer.MIN_VALUE : arr1[index1];
            int right1 = index1 == n - 1 ? Integer.MAX_VALUE : arr1[index1 + 1];
            int left2 = index2 == -1 ? Integer.MIN_VALUE : arr2[index2];
            int right2 = index2 == m - 1 ? Integer.MAX_VALUE : arr2[index2 + 1];
            
            if (left1 <= right2 && left2 <= right1)
                return Math.max(left1, left2);
            
            if (left1 > right2)
                r = index1 - 1;
            else
                l = index1 + 1;
        }
    }
}