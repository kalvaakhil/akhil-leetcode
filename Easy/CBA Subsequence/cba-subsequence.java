//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			String S = br.readLine();
			Solution obj = new Solution();
			System.out.println(obj.cbaSubsequence(S, N));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	String cbaSubsequence(String S, int N) {
		//Write your code here
		S=S.replace("cba","abc");
		char x[]=S.toCharArray();
		Arrays.sort(x);
		return new String(x);
	}
}