class Solution {
    public long maximumOr(int[] nums, int k) {
        int n = nums.length, pre[] = new int[n], post[] = new int[n];
        long res = 0L;
        for (int i = 1; i < n; i++) {
            // pre[i] is the prefix or for i, nums[0] | ... | nums[i - 1]
            pre[i] = pre[i - 1] | nums[i - 1]; 
            // post[i] is the suffix or for i, nums[i + 1] | ... | nums[n - 1]
            post[n - 1 - i] = post[n - 1 - i + 1] | nums[n - 1 - i + 1];
        }
        for (int i = 0; i < n; i++) {
            res = Math.max(res, pre[i] | (long) nums[i] << k | post[i]);
        }
        return res;
    }
}