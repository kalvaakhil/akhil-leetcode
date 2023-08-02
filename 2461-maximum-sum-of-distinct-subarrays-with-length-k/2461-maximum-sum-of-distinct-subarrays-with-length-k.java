class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, maxSum = 0;
        int i = 0, j = 0;
        Set<Integer> hs = new HashSet<>();
        while(j < nums.length){
            if(j - i < k && hs.size() < k){
                while(hs.size()>0 && hs.contains(nums[j])){
                    sum -= nums[i];
                    hs.remove(nums[i++]);
                }
                sum+=nums[j];
                hs.add(nums[j]);
                j++;
            }else{
                if(j - i == k && hs.size() == k){
                    maxSum = Math.max(maxSum , sum);
                    
                }
                sum-=nums[i];
                hs.remove(nums[i]);
                i++;
            }
            
        }
        
        if(j - i == k && hs.size() == k){
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
            
    }
}