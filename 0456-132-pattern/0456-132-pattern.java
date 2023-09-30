class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int prevMin = Integer.MIN_VALUE;
        int potentialPeak = nums.length;
        for (int i = nums.length - 1; i >=0; i--) {
            if (nums[i] < prevMin) {
                return true;
            }
            while (potentialPeak < nums.length && nums[i] > nums[potentialPeak]) {
                prevMin = nums[potentialPeak++];
            }
            potentialPeak--;
            nums[potentialPeak] = nums[i];
        }
        return false;
    }
}