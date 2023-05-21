class Solution {
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> c = new HashMap<>();
        for (int num : nums) {
            c.put(num, c.getOrDefault(num, 0) + 1);
        }
        
        int ans = 0;
        int left = 0;
        int right = nums.length;
        for (int val : c.values()) {
            right -= val;
            ans += left * val * right;
            left += val;
        }
        return ans;
    }
}