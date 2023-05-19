class Solution {
	public static int magnificentSets(int n, int[][] edges) {
		// Make an array of adjacent nodes
		int[] degree = new int[n + 1];
		for (int[] edge : edges) {
			degree[edge[0]]++;
			degree[edge[1]]++;
		}
		int[][] adjacent = new int[n + 1][];
		for (int i = 1; i <= n; i++)
			adjacent[i] = new int[degree[i]];
		for (int[] edge : edges) {
			int a = edge[0];
			int b = edge[1];
			adjacent[a][--degree[a]] = b;
			adjacent[b][--degree[b]] = a;
		}
		// Find the largest distance from each node to other nodes in its component
		int[] queue = new int[n];
		int[] distance = new int[n + 1];
		int[] maxDistance = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			Arrays.fill(distance, -1);
			queue[0] = i;
			distance[i] = 0;
			int maxDist = 0;
			int first = 0;
			int last = 0;
			while (first <= last) {
				int node = queue[first++];
				int d = distance[node] + 1;
				for (int aNode : adjacent[node])
					if (distance[aNode] < 0) {
						distance[aNode] = d;
						maxDist = d;
						queue[++last] = aNode;
					}
			}
			maxDistance[i] = maxDist;
		}
		// Split the graph into components, checking if it is bipartite
		// and adding the diameter of each component to the final result
		Arrays.fill(distance, -1);
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (distance[i] >= 0) // the node i is already examined
				continue;
			queue[0] = i;
			distance[i] = 0;
			int diameter = 0;
			int first = 0;
			int last = 0;
			while (first <= last) {
				int node = queue[first++];
				diameter = Math.max(diameter, maxDistance[node]);
				int d = distance[node] + 1;
				for (int aNode : adjacent[node]) {
					int ad = distance[aNode];
					if (ad < 0) {
						distance[aNode] = d;
						queue[++last] = aNode;
					} else if ((d + ad) % 2 != 0) // the graph is not bipartite
						return -1;
				}
			}
			result += diameter + 1;
		}
		return result;
	}
}