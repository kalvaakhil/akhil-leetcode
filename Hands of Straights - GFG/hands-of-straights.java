//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isStraightHand(n, k, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isStraightHand(int N, int groupsize, int hand[]) {
        // code here
        Arrays.sort(hand);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:hand)
        map.put(i,map.getOrDefault(i,0)+1);
        for(int i=0;i<hand.length;i++){
            if(map.get(hand[i])>0){
                int term=(hand[i]);
                int j=0;
            while(j<groupsize){
            if(map.get(term)==null||map.get(term)<=0)
            return false;
            else{
                map.put(term,map.get(term)-1);
                term++;
                j++;
            }
          
            }
            }
        }
        return true;
    }
}
