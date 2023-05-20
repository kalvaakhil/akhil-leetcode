class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int res[][] = new int[n-2][n-2];
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
                res[i][j] = findMax(grid, i, j);
            }
        }
        return res;
    }
    public int findMax(int[][] grid, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int a = i; a < i+3; a++) {
            for (int b = j; b < j+3; b++) {
                max = Math.max(grid[a][b], max);
            }
        }
        return max;
    }

}