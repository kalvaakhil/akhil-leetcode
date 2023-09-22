//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java



class Solution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        ArrayList<Long> al=new ArrayList<Long>();
        Arrays.sort(arr);
        int fst=0;
        int lst=N-1;
        
        for(int i=0;i<=N/2;i++){
            
            al.add(arr[lst]);
            lst--;
            al.add(arr[fst]);
            fst++;
            
        }
        return al;
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] a2 = line.trim().split("\\s+");
//            int n =Integer.parseInt(a2[0]);
//            int k =Integer.parseInt(a2[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            Solution ob = new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            ArrayList<Long> ans = ob.alternateSort(a, n);
            for (int i = 0; i < n; i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
    }
}




// } Driver Code Ends