class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        // int sum=Arrays.stream(nums).sum();
        int n=nums.length;
        int m=queries.length;
        int ans[]=new int[m];
        for(int i=0;i<m;i++){
            int j=0;
            int sum=0;
            while(j<n && sum<queries[i]){
                sum+=nums[j];
                if(sum<=queries[i])
                j++;
            }
            System.out.println(sum);
            ans[i]=j;
        }
        return ans;
    }
}