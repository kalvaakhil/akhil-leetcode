//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);

            ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

            int i = 0;
            while (i++ < E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<>();
                t1.add(u);
                t1.add(v);
                t1.add(w);
                edges.add(t1);
            }

            int S = Integer.parseInt(read.readLine());

            Solution ob = new Solution();

            int[] ptr = ob.bellman_ford(V, edges, S);

            for (i = 0; i < ptr.length; i++) System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*
*   edges: vector of vectors which represents the graph
*   S: source vertex to start traversing graph with
*   V: number of vertices
*/
class Solution {
    public static class Graph {
		private int V;
		private int E;
		private Edge edges[];

		public class Edge {
			private int u;
			private int v;
			private int weight;

			public Edge() {
				this.u = 0;
				this.v = 0;
				this.weight = 0;
			}
		};

		public Graph(int v, int e) {
			this.V = v;
			this.E = e;
			this.edges = new Edge[this.E];
			for (int i = 0; i < this.E; ++i) {
				this.edges[i] = new Edge();
			}
		}

		public int[] shortestPath(int src) {
			int distance[] = new int[V];
			Arrays.fill(distance, (int) (1e8));
			distance[src] = 0;
			for (int i = 0; i < V - 1; ++i) {
				for (int j = 0; j < E; ++j) {
					int u = this.edges[j].u;
					int v = this.edges[j].v;
					int weight = this.edges[j].weight;
					if (distance[u] != (int) (1e8) && distance[u] + weight < distance[v]) {
						distance[v] = distance[u] + weight;
					}
				}
			}
			for (int j = 0; j < E; ++j) {
				int u = this.edges[j].u;
				int v = this.edges[j].v;
				int weight = this.edges[j].weight;
				if (distance[u] != (int) (1e8) && distance[u] + weight < distance[v]) {
					return new int[] { -1 };
				}
			}
			return distance;
		}
	}

	static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
		Graph graph = new Graph(V, edges.size());
		int i = 0;
		for (ArrayList<Integer> edge : edges) {
			graph.edges[i].u = edge.get(0);
			graph.edges[i].v = edge.get(1);
			graph.edges[i].weight = edge.get(2);
			i++;
		}
		return graph.shortestPath(S);
	}
}