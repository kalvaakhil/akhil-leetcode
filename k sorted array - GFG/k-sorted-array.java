//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{ 
    static String isKSortedArray(int arr[], int n, int k) 
    { 
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new Pair(arr[i], i));
        }
        Collections.sort(list, (a, b) -> a.el - b.el);
        for(int i=0; i<n; i++){
            Pair p = list.get(i);
            if(Math.abs(p.ind - i) > k) return "No";
        }
        return "Yes";
    }

}
class Pair{
    int el, ind;
    Pair(int e, int i){
        el = e; ind = i;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		    }
		    int k=Integer.parseInt(br.readLine());
		    Solution ob=new Solution();
		    String ans=ob.isKSortedArray(a,n,k);
		    System.out.println(ans);
		    
		}
	}
}
// } Driver Code Ends