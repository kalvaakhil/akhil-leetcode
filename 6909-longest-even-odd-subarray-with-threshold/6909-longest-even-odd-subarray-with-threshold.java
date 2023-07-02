class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int answer = 0, i = 1, r = Integer.MAX_VALUE;
        if(nums[0] <= threshold && nums[0] % 2 == 0) {
            r = 0;
        }
        while(i < nums.length){
            if( nums[i] > threshold || ((nums[i] % 2) == (nums[i-1] % 2)) ){
                // Conditions not satisfied
                answer = Math.max(answer, i - r );
                r = Integer.MAX_VALUE;
            }
            if(r == Integer.MAX_VALUE && nums[i] <= threshold && nums[i] % 2 == 0){
                // Conditions satisfied - increase the length of subarray
                r = i;
            }
            i++;
        }
        answer = Math.max(answer, i - r );
        return answer;
    }
}