//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        String[] arr = s.split("\\.");
        
        boolean flag = false;
         if(s.endsWith(".")){
           return false;
       }
        if(arr.length!=4){
            return false;
        }
        for(int i = 0;i<arr.length;i++){
           
           if(arr[i].length()>1 && arr[i].startsWith("0")){
               return false;            
               }
           if(arr[i].equals("")){
               return false;  
               }
               if(!arr[i].matches("\\d+"))
               return false;
               int x=Integer.parseInt(arr[i]);
            if(x>=0 && x<256){
                flag = true;
            }
                
            else{
                flag = false;
                break;
            }
        }
        if(flag==true){
            return true;
        }
        else
        return false;
    }
}