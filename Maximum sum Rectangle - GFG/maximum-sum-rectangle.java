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
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    
    public static int maxsumsubArray(int[] arr, int N){
        int curr = 0;
        int max = arr[0];
        
        for(int i = 0; i < N; i++){
            curr += arr[i];
            if(curr > max) max = curr;
            if(curr < 0) curr = 0;    
        }
        
        return max;
    }
    
    int maximumSumRectangle(int N, int M, int arr[][]) {
        // code here
        int max = maxsumsubArray(arr[0], arr[0].length);
        for(int k = 0; k < N; k++){
            int dummy[] = new int[M];
            for(int i = k; i < N; i++){
                for(int j = 0; j < M; j++){
                    dummy[j] += arr[i][j];
                }
                
                int sum = maxsumsubArray(dummy, M);
                if(sum > max) max = sum;
            }
        }
        return max;
    }
};