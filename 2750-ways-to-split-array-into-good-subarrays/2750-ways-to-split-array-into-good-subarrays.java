class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        int count=0;
        long ans=1;
        int check_1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(check_1==1)
                    count++;
            }
            else{
                if(check_1==0){
                   check_1=1;
                    count++;
                }
                else{
                    ans=(ans*count)%1000000007;
                    count=1;
                }
            }
        }
        if(count==0) return 0;
        return (int)ans;
    }
}