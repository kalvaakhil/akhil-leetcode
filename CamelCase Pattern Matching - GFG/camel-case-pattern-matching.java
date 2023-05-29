//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String[] Dictionary=read.readLine().split(" ");
            String Pattern=read.readLine();
            Solution ob = new Solution();
            ArrayList <String> ans=ob.CamelCase(N,Dictionary,Pattern);
            for(String u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0, k = 0; j < Dictionary[i].length() && k < Pattern.length(); j++) {
                if (Character.isUpperCase(Dictionary[i].charAt(j))) {
                    if (Dictionary[i].charAt(j) == Pattern.charAt(k)) {
                        count++;
                        k++;
                    } else {
                        break;
                    }
                }
                if (count >= Pattern.length()) {
                    ans.add(Dictionary[i]);
                }
                Collections.sort(ans);
            }
        }
        if (ans.size() == 0) {
            ans.add("-1");
        }
        return ans;
    }
}