//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.CountSpecialPalindrome(S));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
  public long CountSpecialPalindrome(String S)
    {
      ArrayList<Character> letters = new ArrayList<>();
      ArrayList<Integer> cnt = new ArrayList<>();
      
      for(int i = 0; i < S.length(); ){
          int j = i;
          
          while(i < S.length() && S.charAt(j) == S.charAt(i))
          i++;
          
          letters.add(S.charAt(j));
          cnt.add(i-j);
      }
      
  //  System.out.print(letters+" "+cnt);
     long res = 0;
     for(int i = 0; i < letters.size(); i++){
         if(cnt.get(i) > 1){
             long sub = cnt.get(i)-1;
             res += ((sub*(sub+1))/2);
         }
         else{
          
          
             if(i > 0 && i < letters.size()-1 && letters.get(i-1) == letters.get(i+1)){
                //  System.out.print(letters+" "+cnt);
                 res += Math.min(cnt.get(i-1), cnt.get(i+1));
             }
         }
         
      
     }
        return res;
    }
}