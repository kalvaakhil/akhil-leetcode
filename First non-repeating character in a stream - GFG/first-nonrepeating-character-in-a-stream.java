//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
  public String FirstNonRepeating(String A)
    {
        // code here
        int[] char_arr = new int[26];
        
        StringBuilder str = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        
        for(char ch : A.toCharArray()){
            char_arr[ ch - 'a']++;
    
            if( char_arr[ch - 'a'] <= 1)
                q.add(ch);
            else
                q.remove(ch);
                
            if(q.isEmpty())
                str.append('#');
            else   str.append(q.peek()); 
                
        }
        return str.toString();
    }


}