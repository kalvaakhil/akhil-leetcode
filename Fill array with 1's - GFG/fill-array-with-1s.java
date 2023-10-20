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
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.minMoves(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
public long minMoves(long arr[], long n)

    {

    long c = 0;

    long temp = 0;

    int prevIndex = -1;

    for (int i = 0;i<n;i++) {

        if (arr[i] == 1) {

            if (prevIndex == -1) {

                prevIndex = i;

                c = Math.max(c, temp);

                temp = 0;

            } else {

                prevIndex = i;

                c = Math.max(c, (temp+1)/2);

                temp = 0;

            }

        } else {

            temp ++;

        }

    }

    c = Math.max(c, temp);

    if (prevIndex == -1) {

        c = -1;

    }

    return (int)c;

    }
}