//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int t) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> >();
       
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                int k=j+1;
                int l=n-1;
                while(k<l)
                {
                    
                    if(arr[i]+arr[j]+arr[k]+arr[l]==t)
                    {
                    ArrayList<Integer> al=new ArrayList<Integer>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);
                    al.add(arr[l]);
                    if(!list.contains(al))
                    {
                        list.add(al);
                    }
                    k++;
                    l--;
                    }
                    else if(arr[i]+arr[j]+arr[k]+arr[l]<t)
                    {
                        k++;
                    }
                    else
                    {
                        l--;
                    }
                }
                
            }
        }
        return list;
    }
}