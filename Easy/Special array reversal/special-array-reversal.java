//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverse(String str)
    {
        char[] s =  str.toCharArray();
        int i=0, j =  s.length-1;
        while(i < j){
            if(!(s[i]>='a' && s[i]<='z') && !(s[i]>='A' && s[i]<='Z')){
                i++;
            }
            else if(!(s[j]>='a' && s[j]<='z') && !(s[j]>='A' && s[j]<='Z')){
                j--;
            }
            else{
                char temp =  s[i];
                s[i] =  s[j];
                s[j] =  temp;
                i++; j--;
                
            }
        }
        return String.valueOf(s);
    }
}