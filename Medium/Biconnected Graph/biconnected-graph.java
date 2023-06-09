//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int n = Integer.parseInt(S[0]);
            int e = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            int[] arr = new int[2*e];
            
            for(int i=0; i<2*e; i++)
                arr[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.biGraph(arr,n,e));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
   static int time=0;
   static int biGraph(int[] arr, int n, int e) {
       
       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
       for(int i=0;i<n;i++)
       adj.add(new ArrayList<>());
       
       for(int i=0;i<2*e;i+=2)
        {
            adj.get(arr[i]).add(arr[i+1]);
            adj.get(arr[i+1]).add(arr[i]);
        }
       
       boolean [] visited=new boolean[n];
       int dis[]=new int[n];
       int low[]=new int[n];
       int parent[]=new int[n];
       
       for(int i=0;i<n;i++)
       {
           parent[i]=-999;
           visited[i]=false;
       }
       
       if(fun(0,visited,dis,low,parent,adj)==true)
       return 0;
       
       for(int i=0;i<n;i++)
        if(visited[i]==false)
          return 0;
          
        return 1;  
   }
   static boolean fun(int s,boolean []visited,int[] dis,int [] low,int []parent,ArrayList<ArrayList<Integer>> adj)
   {
       int children=0;
       visited[s]=true;
       dis[s]=low[s]=++time;
       for(int v:adj.get(s))
        {
            if(visited[v]==false)
            {
                children++;
                parent[v]=s;
                
                if(fun(v,visited,dis,low,parent,adj)==true)
                 return true;
                 
                 low[s]=Math.min(low[s],low[v]);
                 
                if(parent[s]==-999 && children>1)
                  return true;
                  
                if(parent[s]!=-999 && low[v]>=dis[s])
                  return true;
                
            }
            else if(v!=parent[s])
             low[s]=Math.min(low[s],dis[v]);
        }
        return false;
   }
};