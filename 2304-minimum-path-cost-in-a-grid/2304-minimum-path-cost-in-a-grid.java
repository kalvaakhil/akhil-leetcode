class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int n=grid.length;
        int m=grid[0].length;

        int dp[][]=new int[n][m];
        for(int i=0;i<m;i++){
            dp[n-1][i]=grid[n-1][i];
        }

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<m;j++){
                int min=Integer.MAX_VALUE;
                for(int k=0;k<m;k++){
                    min=Math.min(min,dp[i+1][k]+moveCost[grid[i][j]][k]);
                }
                dp[i][j]=min+grid[i][j];
            }
        }
        
        int min=Integer.MAX_VALUE;
        for(int i:dp[0])min=Math.min(min,i);
        return min;
    }
}