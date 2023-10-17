//{ Driver Code Starts
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
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            int ans = obj.detectCycle(V, adj);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class disJoint{
    int[] rank;
    int[] parent;
    public disJoint(int size) {
        this.rank = new int[size];
        this.parent = new int[size];
        for (int i = 0; i < size; i++) {
            this.parent[i] = i;
            this.rank[i] = 1;
        }
    }
    
    public int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        
        return parent[x] = find(parent[x]);
    }
    
    public void union (int a, int b) {
        int parA = find(a);
        int parB = find(b);
        
        if (rank[parA] == rank[parB]) {
            parent[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] > rank[parB]) {
            parent[parB] = parA;
        } else {
            parent[parA] = parB;
        }
    }
    
    
}
class Solution
{
    //Function to detect cycle using DSU in an undirected graph.
    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {

        // Code here
        if(V == 2) return 0;
        disJoint d = new disJoint(V);
        
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int n = adj.get(i).get(j);
                
                if (d.find(i) != d.find(n)) {
                    d.union(i, n);
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
}