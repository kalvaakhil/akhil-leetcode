//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{

    static int numberOfSubsequences(String S, String W){

        ArrayList<Character> al = new ArrayList<>();

        for(int i=0; i<S.length(); i++){

            al.add(S.charAt(i));

        }

        int j=0, i=0, count=0;

        while(i<al.size()){

            if(al.get(i)==W.charAt(j)){

                j++;

                al.remove(i);

                if(j==W.length()){

                    i=0;

                    j=0;

                    count++;

                }

                continue;

            }              

            i++;

        }

        return count;

    }

}