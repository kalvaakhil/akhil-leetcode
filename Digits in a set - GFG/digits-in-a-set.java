//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            long ans = new Solution().countNumbers(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int countNumbers(int n) {
        int count = 0;
        
        for(int i = 1;i<=n;i++){
            boolean flag = true;
            
            int num = i;
            
            while(num!=0){
                int d = num % 10;
                
                if(d != 1 && d!= 2 && d!= 3 && d!= 4 && d!= 5){
                    flag = false;
                    break;
                }
                
                num /= 10;
            }
            
            if(flag)
                count++;
        }
        return count;
    }
}
