//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> Q = new ArrayList<>();
            
            for(int i=0; i<N; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                int type = Integer.parseInt(S[0]);
                int val = Integer.parseInt(S[1]);
                
                temp.add(type);
                temp.add(val);
                
                Q.add(temp);
            }

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.constructList(Q,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static ArrayList<Integer> constructList(ArrayList<ArrayList<Integer>> Q, int N) {
        // code here
        int[] arr = new int[N+1];
        int index = N;
        int xor = 0;
        for(int i=N-1; i>=0; i--) {
            int type = Q.get(i).get(0), num = Q.get(i).get(1);
            if(type == 0) {
                arr[index] = num;
                arr[index] ^= xor;
                index--;
            } else {
                xor = xor ^ num;
                continue;
            }
        }
        
        arr[index] ^= xor;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=index; i<=N; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        return list;
    }
};