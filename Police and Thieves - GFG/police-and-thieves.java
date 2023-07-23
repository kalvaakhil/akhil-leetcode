//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 


// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    static int catchThieves(char arr[], int n, int k) 
{ 
        // Code here
        int ans = 0;
        ArrayList<Integer> police = new ArrayList<>();//to store indexes of police
        ArrayList<Integer> thieves = new ArrayList<>();// to store indexes of thieves
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'P') police.add(i);
            else{
                thieves.add(i);
            }
        }
        
        int i = 0, j = 0;
        while(i < police.size() && j < thieves.size()){
            if(Math.abs(police.get(i) - thieves.get(j)) <= k) {
                ans++; i++; j++;
                
            }
            else if(police.get(i) > thieves.get(j)) j++;
            else i++;
        }
        return ans;
} 
} 



//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
			char arr[] = new char[n];
			for(int i=0; i<n; i++)
         		arr[i] = sc.next().charAt(0);

			Solution ob = new Solution();
            System.out.println(ob.catchThieves(arr, n, k));
            t--;
        }
    }
}       
// } Driver Code Ends