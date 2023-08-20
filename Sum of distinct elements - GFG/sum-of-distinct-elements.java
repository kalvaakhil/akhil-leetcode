//{ Driver Code Starts
//Initial Template for Java





import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findSum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
 int findSum(int arr[], int n) {
        ArrayList<Integer> list=new ArrayList<>();
        
        for (int num : arr) {
           list.add(num);
        }

        // Create a HashSet and add the sum to it
        int sum=0;
        Set<Integer> set = new HashSet<>(list);
     for(int num:set) {
         sum +=num;
     }

        return sum;

    }
}

