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

            int ans[] = new Solve().printUnsorted(arr, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java




class Solve {
    int[] printUnsorted(int[] arr, int n) {
        // code here
        int res[] = new int[2];
        int minProbElement = Integer.MAX_VALUE, maxProbElement = Integer.MIN_VALUE;
        for(int i=0;i<n;++i) {
            boolean flag1 = false, flag2 = false;
            if(i - 1 >= 0 && arr[i] < arr[i-1]) {
                flag1 = true;
            }
            if(i + 1 < n && arr[i] > arr[i+1]) {
                flag2 = true;
            }
            if(flag1 || flag2) {
                if(arr[i] < minProbElement) {
                    minProbElement = arr[i];
                }
                if(arr[i] > maxProbElement) {
                    maxProbElement = arr[i];
                }
            }
        }
        if( (minProbElement == Integer.MAX_VALUE) && (maxProbElement == Integer.MIN_VALUE) ) {
            res[0] = 0;
            res[1] = 0;
        }
        int j = 0;
        while(j < n) {
            if(arr[j] > minProbElement) {
                res[0] = j;
                break;
            }
            ++j;
        }
        int k = n - 1;
        while(k >= 0) {
            if(arr[k] < maxProbElement) {
                res[1] = k;
                break;
            }
            --k;
        }
        return res;
    }
}