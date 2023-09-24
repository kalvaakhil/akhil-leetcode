//{ Driver Code Starts
import java.util.*;

class GFG 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
     
        while(T>0)
        {
             int N = sc.nextInt();
             int k = sc.nextInt();
             int ar[] = new int[N];
             //	int count = 0;
             for(int i = 0; i < N; i++)
            	ar[i] = sc.nextInt();
            		
            	System.out.println(new Solution().max_Books(ar,N,k));
            T--;
            }
        }
    }
// } Driver Code Ends



class Solution
{
    int max_Books(int a[], int n, int k)
    {
         // Your code here      
                int ans=0;
         int count=0;
         for(int i=0;i<n;i++)
         {
             if(a[i]<=k)
             {
                 count+=a[i];
                 ans=Math.max(count,ans);
             }
             else{
                 count=0;
             }
         }
         return ans;
    }
}