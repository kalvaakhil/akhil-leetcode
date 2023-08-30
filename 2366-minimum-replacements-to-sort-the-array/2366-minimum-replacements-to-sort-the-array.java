class Solution {
    public long MinimumReplacement(int[] nums) {
        long ans = 0;
        int lastOne = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > lastOne){
                int times = nums[i] / lastOne;
                ans += times - 1;
                int rest = nums[i] % lastOne;
                if(rest != 0){
                    lastOne = nums[i] / (times + 1);                                      
                    ans++;
                }
            }else{
                lastOne = nums[i];
            }
        }
        return ans;
    }
    public long minimumReplacement(int[] nums) {
        return MinimumReplacement(nums);
    }
}