//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution{
	public static class Pair {
		private int v;
		private int weight;

		public Pair(int v, int distance) {
			this.v = v;
			this.weight = distance;
		}
	}

	static int minimumSpanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
		PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>((o1, o2) -> o1.weight - o2.weight);
		boolean[] visited = new boolean[V];
		minHeap.add(new Pair(0, 0));
		int sum = 0;
		while (minHeap.size() > 0) {
			Pair pair = minHeap.poll();
			int u = pair.v;
			int weight = pair.weight;
			if (visited[u] == true) {
				continue;
			}
			visited[u] = true;
			sum += weight;
			for (int i = 0; i < adj.get(u).size(); i++) {
				int neighbour = adj.get(u).get(i).get(0);
				int neighbourWeight = adj.get(u).get(i).get(1);
				if (visited[neighbour] == false) {
					minHeap.add(new Pair(neighbour, neighbourWeight));
				}
			}
		}
		return sum;
	}

	static int spanningTree(int V, int E, int edges[][]) {
		ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<ArrayList<Integer>>());
		}
		for (int i = 0; i < edges.length; i++) {
			int u = edges[i][0];
			int v = edges[i][1];
			int weight = edges[i][2];
			ArrayList<Integer> tmp1 = new ArrayList<Integer>();
			ArrayList<Integer> tmp2 = new ArrayList<Integer>();
			tmp1.add(v);
			tmp1.add(weight);

			tmp2.add(u);
			tmp2.add(weight);

			adj.get(u).add(tmp1);
			adj.get(v).add(tmp2);
		}
		return minimumSpanningTree(V, adj);
	}
}