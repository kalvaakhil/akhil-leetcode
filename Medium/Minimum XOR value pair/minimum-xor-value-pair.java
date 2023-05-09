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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            

            Solution ob = new Solution();
            
            System.out.println(ob.minxorpair(N,arr));
            
            
        }
    }
}

// } Driver Code Ends


class TrieNode
{
   TrieNode left;
   TrieNode right;
}

class Solution
{
   static int minxorpair(int N, int arr[])
   {
       TrieNode head = new TrieNode();
       insert(head, arr[0]);
       int i, min_xor=Integer.MAX_VALUE;
       
       for(i=1; i<N; i++)
       {
           min_xor = Math.min(min_xor, minXorPairUtil(head, arr[i]));
           insert(head, arr[i]);
       }
       
       return min_xor;
   }
   
   static void insert(TrieNode head, int n)
   {
       TrieNode cur = head;
       int i, b;
       
       for(i=31; i>=0; i--)
       {
           b = (n>>i)&1;
           
           if(b == 0)
           {
               if(cur.left == null)
                   cur.left = new TrieNode();
               
               cur = cur.left;
           }
           else
           {
               if(cur.right == null)
                   cur.right = new TrieNode();
               
               cur = cur.right;
           }
       }
   }
   
   static int minXorPairUtil(TrieNode head, int value)
   {
       int j, b, cur_xor=0;
       TrieNode cur = head;
       
       for(j=31; j>=0; j--)
       {
           b = (value>>j)&1;
           
           if(b == 0)
           {
               if(cur.left != null)
                   cur = cur.left;
               else
               {
                   cur_xor |= (1<<j);
                   cur = cur.right;
               }
           }
           else
           {
               if(cur.right != null)
                   cur = cur.right;
               else
               {
                   cur_xor |= (1<<j);
                   cur = cur.left;
               }
           }
       }
       
       return cur_xor;
   }
}