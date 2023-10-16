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
            inputLine = br.readLine().trim().split(" ");
            int r = Integer.parseInt(inputLine[0]);
            int c = Integer.parseInt(inputLine[1]);
            boolean[][] mat = new boolean[r][c];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    mat[i][j] = (Integer.parseInt(inputLine[i * c + j]) == 1);
                }
            }

            int ans = new Solution().maxArea(mat, r, c);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int maxArea(boolean[][] mat, int r, int c) {
        // code here
        int Result = 0;
        int newarr[] = new int[mat[0].length];
        for(int a = 0; a < mat.length; a++){
            
            for(int j = 0; j < mat[a].length; j++){
                if(mat[a][j] == false) {
                    newarr[j] = 0;
                    continue;    
                }
                
                if(mat[a][j] == true)
                    newarr[j] += 1;
            }
            
            HashMap<Integer, Integer> map = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();
            
            int[] arr = newarr.clone();
            Arrays.sort(arr);
            // System.out.println(Arrays.toString(arr));
            
            for(int i = 0; i < arr.length; i++){
                
                if(set.contains(arr[i])) continue;
                
                for(int j = i; j < arr.length; j++){
                    if(!set.contains(arr[i])) {
                        
                        map.put(arr[i], arr[i]);  
                        set.add(arr[i]);
                        
                    } else if(set.contains(arr[i])){
                        
                        map.put(arr[i], map.get(arr[i]) + arr[i]);
                        
                    }
                }
            }
            
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
             if(entry.getValue() > Result) Result = entry.getValue();
            
        }
        
        return Result;
    }
}