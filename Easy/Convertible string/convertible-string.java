//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while(T-->0)
        {
            String s = sc.next();
            String t = sc.next();
            Solution ob = new Solution();
            int res  = ob.EqualString(s, t);
            System.out.println(res);                        
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int EqualString(String s, String t)
    {
        
        int n=s.length();
        if(n!=t.length())return 0;
        
        StringBuilder so=new StringBuilder();
        StringBuilder se=new StringBuilder();
        StringBuilder to=new StringBuilder();
        StringBuilder te=new StringBuilder();
        
        
     for(int i=0;i<n;i++){
            if(i%2==0){
                se.append(s.charAt(i));
                te.append(t.charAt(i));
            }else{
                so.append(s.charAt(i));
                to.append(t.charAt(i));
            }
        }
        if(sorted(se).equals(sorted(te)) && sorted(so).equals(sorted(to)))return 1;
        return 0;
        
    }
    
    public static String sorted(StringBuilder s){
        char arr[]=s.toString().toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}