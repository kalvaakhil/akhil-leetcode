//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
class Solution
{
 void leftRotate(long arr[], int k, int n) {
    if (k > n) {
        k = k % n; // Corrected this line
    }
    
    long ans[] = new long[n];
    int over = 0;
    
    for (int i = 0; i < n; i++) {
        ans[i] = arr[k];
        k++;
        
        if (k == n) {
            ans[i] = arr[n - 1];
            over = i + 1; // Corrected this line
            break;
        }
    }
    
    int left = n - over; // Corrected this line
    
    for (int i = 0; i < left; i++) {
        ans[over] = arr[i];
        over++;
    }
    
    for (int i = 0; i < n; i++) {
        arr[i] = ans[i];
    }
}

}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            ob.leftRotate(a,k,n);
            for (int i = 0; i < n; i++)
                out.print(a[i]+" ");
            out.println();
        }
        out.close();
    }
}





// } Driver Code Ends