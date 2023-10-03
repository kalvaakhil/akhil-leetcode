class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0,n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                    c++;
            }
        }
        return c;
    }
}