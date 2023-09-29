class Solution {
    public List<Integer> minSubsequence(int[] nums) {
       int n = nums.length;
       Arrays.sort(nums);
       int sum=0,s=0;
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<n;i++){
           sum+=nums[i];
       }
       for(int j=n-1;j>=0;j--){
           s+=nums[j];
           sum=sum-nums[j];
           list.add(nums[j]);
           if(s>sum){
               break;
           }
       }
       return list; 
    }
}