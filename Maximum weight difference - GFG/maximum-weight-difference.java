//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            long ans = new Solution().solve(arr, n, k);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java




class Solution {
    long solve(int[] arr, int n, int k) {

        Arrays.sort(arr);

        long sk=0,sr=0,sk1=0,sr1=0,j=0,l=0;

        for(int i=0;i<n;i++)

        {

            if(j<k)

            {

                sk+=arr[i];

                j++;

            }

            else

            {

                sr+=arr[i];

            }

            if(l<k)

            {

                sk1+=arr[n-i-1];

                l++;

            }

            else

            {

                sr1+=arr[n-i-1];

            }

        }

        return Math.max(Math.abs(sk-sr),Math.abs(sk1-sr1));

    }
}
