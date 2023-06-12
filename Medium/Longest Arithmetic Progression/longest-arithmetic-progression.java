//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().lengthOfLongestAP(a, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
int solve(int i, int j, int diff , int A[], int n){
       int ans=0;
       
       for(int iter = i-1;iter>=0;iter--){
           if(A[i]-A[iter] == diff){
               ans++;
               i=iter;
           }
       }
       return ans;
   }
   int lengthOfLongestAP(int A[], int n) {
       // code here
       if(n<=2){
           return n;
       }
       int ans=0;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               int diff = A[j]-A[i];
               ans = Math.max(ans, solve(i,j,diff,A,n) + 2);
           }
       }
       return ans;
   }
}
