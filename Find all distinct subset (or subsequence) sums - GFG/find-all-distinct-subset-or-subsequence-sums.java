//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            int[] ans = obj.DistinctSum(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
     public int[] DistinctSum(int[] nums)
   {
       // Code here
       int W=0;
       for(int i=0;i<nums.length;i++)
       W=W+nums[i];
       int n=nums.length;
       Arrays.sort(nums);
         int ar[][]=new int[n+1][W+1];
        for(int i=1;i<n+1;i++) {
for(int j=1;j<W+1;j++) {
 if(j>=nums[i-1]){
                   ar[i][j]=(int)Math.max(ar[i-1][j],(ar[i-1][j-nums[i-1]])+nums[i-1]);
               }
               else{
               ar[i][j]=ar[i-1][j];
           }
}
}
Set<Integer> s=new HashSet<>();
for(int i=0;i<=W;i++){
   s.add(ar[n][i]);
}
ArrayList<Integer> a=new ArrayList<>(s);
int br[]=new int[a.size()];
for(int i=0;i<br.length;i++){
   br[i]=a.get(i);
}
Arrays.sort(br);
return br;
   }
}