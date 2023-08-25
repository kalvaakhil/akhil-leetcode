//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
        static int isPossible(String s){
        // code here
        
        HashMap<Character,Integer> m=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        
        if(m.size()>=4)
           return 1;
        else if(m.size()==3 && n>=5)
           return 1;
        else if(m.size()==2){
            for(Map.Entry<Character,Integer> e:m.entrySet()){
                if(e.getValue()<2 && n<7)
                  return 0;
            }
            if(n>=6)
              return 1;
        }
         
           return 0;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(s));
        }
    }
}

// } Driver Code Ends