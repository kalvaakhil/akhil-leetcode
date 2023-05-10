//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int K;
            K = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.totalCuts(N, K, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int totalCuts(int n, int k, int[] arr) {
        // code here
        int mini[] = new int[n];
        int maxi[] = new int[n];
        
        maxi[0] = arr[0];
        mini[n-1] = arr[n-1];
        
        // max from left
        for(int i = 1; i<n; i++){
            maxi[i] = Math.max(maxi[i-1], arr[i]);
        }
        
        //min from right
        for(int i = n-2; i>=0 ; i--){
            mini[i] = Math.min(arr[i], mini[i+1]);
        }
        
        // answer
        int ans = 0;
        for(int i = 1; i<n; i++){
            if(maxi[i-1]+mini[i]>=k) ans++;
        }
        return ans;
    }
}
        
