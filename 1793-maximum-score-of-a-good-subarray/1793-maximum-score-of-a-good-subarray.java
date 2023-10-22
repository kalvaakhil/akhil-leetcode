class Solution {
    public int maximumScore(int[] nums, int k) {
        int n  = nums.length;
        int left = k;
        int  right = k;
        int maximumScore = nums[k];
        int currentMaxScore = nums[k];
        while(left > 0 || right < n - 1){
            if((left > 0 ? nums[left - 1] : 0 ) < (right < n - 1 ? nums[right + 1] : 0)){
                right++;
                currentMaxScore = Math.min(currentMaxScore, nums[right]);
            }
            else {
                left--;
                currentMaxScore = Math.min(currentMaxScore, nums[left]);
            }
            maximumScore = Math.max(maximumScore, currentMaxScore * (right - left + 1));
        }
        return maximumScore;
    }
    
}