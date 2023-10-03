class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=Integer.MIN_VALUE;;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    ans=(long)Math.max(ans,(long)(nums[i]-nums[j])*nums[k]);
                }
            }
        }
        if(ans<0)
            ans=0;
        return ans;
    }
}