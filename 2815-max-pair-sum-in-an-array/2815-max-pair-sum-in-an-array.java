class Solution {
    public int maxSum(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++)
        {
            int first=nums[i];
            int a[]=new int[10];
            while(first!=0)
            {
                a[first%10]++;
                first/=10;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                
                int b[]=new int[10];
                int second=nums[j];
                while(second!=0)
                {
                    b[second%10]++;
                    second/=10;
                }
                int res=-1;
                for(int ind=9;ind>=0;ind--)
                {
                    if(a[ind]>0 && b[ind]>0)
                    {
                        res=ind;
                        break;
                    }
                    else if(a[ind]!=b[ind])
                    {
                        res=-1;
                        break;
                    }
                }
                if(res!=-1)
                {
                    ans=Math.max(ans,nums[i]+nums[j]);
                }
            }
        }
        return ans;
    }
}