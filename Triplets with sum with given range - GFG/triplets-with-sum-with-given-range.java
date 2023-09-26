//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[] = new int[N];
            for (int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            String[] input = new String[2];
            input = read.readLine().split(" ");
            int L = Integer.parseInt(input[0]);
            int R = Integer.parseInt(input[1]);

            Solution ob = new Solution();
            System.out.println(ob.countTriplets(Arr, N, L, R));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
   public static int countTripletsLessThan(int[] arr, int n, int val) {
      
       Arrays.sort(arr);

       
       int ans = 0;

       int j, k;

    
       int sum;

       
       for (int i = 0; i < n - 2; i++) {

           j = i + 1;
           k = n - 1;

         
           while (j != k) {
               sum = arr[i] + arr[j] + arr[k];

               
               if (sum > val) k--;

              
               else {
                   ans += (k - j);
                   j++;
               }
           }
       }

       return ans;
   }

   
   public static int countTriplets(int arr[], int n, int a, int b) {

      
       int res;

       
       res = countTripletsLessThan(arr, n, b) -
             countTripletsLessThan(arr, n, a - 1);

       return res;
   }
}
 