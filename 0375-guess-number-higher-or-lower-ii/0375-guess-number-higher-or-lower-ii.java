class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        
        for (int i = n - 1; i >= 1; --i) {
            for (int j = i + 1; j <= n; ++j) {
                dp[i][j] = Integer.MAX_VALUE;
                // start x from mid because of the observation that the above observations
                int start = i + (j - i) / 2;
                int end = start + 1;
                for (int x = start; x <= j; ++x) {
                    int right = 0;
                    int left = 0;
                    if (x + 1 <= n) {
                        right = dp[x + 1][j];
                    }
                    if (x - 1 >= 0) {
                        left = dp[i][x - 1];
                    }
                    dp[i][j] = Math.min(dp[i][j], x + Math.max(left, right));
                }
            }
        }
        
        return dp[1][n];
    }
}