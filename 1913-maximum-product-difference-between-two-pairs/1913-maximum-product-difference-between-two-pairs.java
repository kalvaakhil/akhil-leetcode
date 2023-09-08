class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int prod1 = nums[0] * nums[1];
        int prod2 = nums[nums.length -1] * nums[nums.length -2];
        return prod2 - prod1;
    }
}