class Solution {
 public int numSubmat(int[][] mat) {
        
	int M = mat.length, N = mat[0].length;

	int res = 0;

	int[] h = new int[N];
	for (int i = 0; i < M; ++i) {
		for (int j = 0; j < N; ++j) {
			h[j] = (mat[i][j] == 0 ? 0 : h[j] + 1);
		}
		res += helper(h);
	}

	return res;
}

private int helper(int[] A) {

	int[] sum = new int[A.length];
	Stack<Integer> stack = new Stack<>();

	for (int i = 0; i < A.length; ++i) {

		while (!stack.isEmpty() && A[stack.peek()] >= A[i]) stack.pop();

		if (!stack.isEmpty()) {
			int preIndex = stack.peek();
			sum[i] = sum[preIndex];
			sum[i] += A[i] * (i - preIndex);
		} else {
			sum[i] = A[i] * (i + 1);
		}

		stack.push(i);
	}

	int res = 0;
	for (int s : sum) res += s;

	return res;
}
}