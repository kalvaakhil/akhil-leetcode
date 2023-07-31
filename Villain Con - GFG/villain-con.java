//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int M = Integer.parseInt(a[1]);
            int mat[][] = new int[M][2];
            for(int i = 0;i < M;i++){
                String a1[] = in.readLine().trim().split("\\s+");
                mat[i][0] = Integer.parseInt(a1[0]);
                mat[i][1] = Integer.parseInt(a1[1]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minColour(N, M, mat));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int minColour(int N, int M, int mat[][]) {
        //we use level topological sort
        //we firstly put all the parent vertices in a queue
        
        //create the graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i =0;i<N;i++)graph.add(new ArrayList<Integer>());
        for(int i =0;i<M;i++){
            graph.get(mat[i][1]-1).add(mat[i][0]-1);
        }
        //find indegree of all vertices
        int [] indegree = new int[N];
        for(ArrayList<Integer> list:graph){
            for(int x: list){
                indegree[x]++;
            }
        }
        //to keep the record  of level we use two queue
        Queue<Integer> mq = new ArrayDeque<>();
        Queue<Integer> hq = new ArrayDeque<>();
        //put all vertices whose indegree =0 in a main queue(parent vertices)
        for(int i =0;i<N;i++){
            if(indegree[i]==0){
                mq.add(i);
            }
        }
        int level =0;
        while(mq.size()>0){
            int front = mq.remove();
            for(int x: graph.get(front)){
                indegree[x]--;
                if(indegree[x]==0){
                    hq.add(x);
                }
            }
            if(mq.size()==0){
                //increase the level
                level++;
                mq = hq;
                hq = new ArrayDeque<>();
            }
        }
        return level;
    }
}