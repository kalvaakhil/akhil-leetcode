//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution ob = new Solution();
            ob.sortIt(a, n);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
            output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public void sortIt(long arr[], long n)
    {
         long ev[] = new long[(int) n];
        long od[] = new long[(int) n];
        int j = 0;
        int k = 0;

        // Separate even and odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                ev[j] = arr[i];
                j++;
            } else {
                od[k] = arr[i];
                k++;
            }
        }

        // Sort the even and odd arrays
        Arrays.sort(ev, 0, j);
        Arrays.sort(od, 0, k);

        // Copy the sorted odd numbers in reverse order to the original array
        int j1 = k - 1;
        for (int i = 0; i < k; i++) {
            arr[i] = od[j1];
            j1--;
        }

        // Copy the sorted even numbers to the original array
        int l = 0;
        for (int i = k; i < n; i++) {
            arr[i] = ev[l];
            l++;
        }
    }
}