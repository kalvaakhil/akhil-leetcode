//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static int maxLength(String S){

        // code here

        int n= S.length();

        List<Integer>ans= new ArrayList<>(n);

        ans.add((int)S.charAt(0));

        int max=1;

        for(int i=1;i<S.length();i++){

            if(ans.get(ans.size()-1)<(int)S.charAt(i)){

                ans.add((int)S.charAt(i));

                max++;

            }

            else{

                int ind=Collections.binarySearch(ans,(int)S.charAt(i));

                if(ind<0){

                    ind=-(ind+1);

                }

                ans.set(ind,(int)S.charAt(i));

            }

        }

        //System.out.print(ans.toString());

        return ans.size();

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
            String S = read.readLine();
            
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}


// } Driver Code Ends