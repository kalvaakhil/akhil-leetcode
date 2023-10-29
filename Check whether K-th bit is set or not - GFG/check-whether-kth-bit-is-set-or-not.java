//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class CheckBit
{
    // Function to check if Kth bit is set or not.
static boolean checkKthBit(int n, int k)
    {

Stack<Integer>st=new Stack<>();
        while(n>0){
            st.push(n%2);
            n=n/2;
        }
        String s="";
        while(!st.isEmpty()){
            
            s+=st.pop();
        }
        int len=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        sb.reverse().toString();
        if(k>len)return false;
        if(sb.charAt(k)=='1')return true;
        return false;

}
    
}

//{ Driver Code Starts.

class GFG
{
	static int n;
	static int k;
	
	// Driver Code
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()); //Inputting the testcases
		
		while(t>0) //While testcases exist
		{
			
			n = Integer.parseInt(br.readLine()); //Input N
			k = Integer.parseInt(br.readLine()); // Input K
			
			CheckBit obj = new CheckBit();
			
			if(obj.checkKthBit(n, k))
				System.out.println("Yes"); //If true, print Yes
				
			else
				System.out.println("No");	// Else print No
            
            t--;
		}
	}
	
	
}
// } Driver Code Ends