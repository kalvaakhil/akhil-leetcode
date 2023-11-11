//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
String reverseWords(String S)
    {
        // code here 
        StringBuilder sc = new StringBuilder();
        int j = 0;
        int i=0;
        boolean check = true;
        for(; i<S.length(); i++) {
            if(S.charAt(i) == '.') {
                sc.insert(0, S.substring(j, i));
                if(check) sc.insert(0, '.');
                check = false;
                j = i;
            }
        }
        
        sc.insert(0, S.substring(j, S.length()));
        if(!check) sc.delete(0, 1);
        
        return sc.toString();
    }

}