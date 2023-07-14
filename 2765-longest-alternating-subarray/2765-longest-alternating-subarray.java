class Solution {
    public int alternatingSubarray(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i + 1] - nums[i] == 1) {
                int longest = 2;
                for (int j = i + 2; j < nums.length; j ++) {
                    if (nums[j] == nums[j - 2]) {
                        longest ++;
                    } 
                    else 
                    {
                        break;
                    }
                }
                res = Math.max(res, longest);
            }
        }
        return res;
    }
}