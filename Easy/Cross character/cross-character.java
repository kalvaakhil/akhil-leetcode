//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.crossPattern(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
  static String crossPattern(String S){
        String result = "";
        int right = 0, left = S.length()-1, n = S.length();
        char chs[] = new char[n];
        
        for(int index = 0; index < S.length(); index++) chs[index] = ' ';
        
        for(int count = 0; count < n; count++) {
            
            char tmp[] = Arrays.copyOf(chs, n);
            tmp[right] = S.charAt(right);
            tmp[left] = S.charAt(left);
            
            if(count / 2 > count) {
                right--;
                left++;
            }
            else {
                right++;
                left--;
            }
            
            result += String.valueOf(tmp);
            
        }
        
        return result;
    }
}