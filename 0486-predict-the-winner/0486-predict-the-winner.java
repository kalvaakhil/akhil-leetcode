class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];

        for(int[] it : dp){
            Arrays.fill(it,-1);
        }
        int player_1 = helper(nums,dp,0,nums.length-1);

        int sum = 0;

        for(int it : nums){
            sum += it;
        }
        sum -= player_1;

        return player_1 >= sum;
    }

    private int helper(int[] nums,int[][] dp, int i, int j){
        if(i > j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int left =nums[i] + Math.min(helper(nums, dp, i+2, j), helper(nums, dp, i+1, j-1));
        int right = nums[j] + Math.min(helper(nums, dp, i+1, j-1), helper(nums, dp, i, j-2));

        return dp[i][j] = Math.max(left,right);
    }
}