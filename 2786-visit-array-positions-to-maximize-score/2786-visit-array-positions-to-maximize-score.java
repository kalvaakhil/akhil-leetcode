class Solution {
    public long maxScore(int[] nums, int x) {
        int n=nums.length;
        long  dp[][]=new long[n][2];
        for(long p[]:dp)Arrays.fill(p,-1);
        
        return solve(1,nums,x,((nums[0]%2==0)?0:1),nums.length,dp)+nums[0]; //nums[0] is the initial value taken
    }
    public long solve(int i,int nums[],int x,int f,int n,long dp[][]){
        if(i>=n)return 0;
        //storing the parity f of before element
        if(dp[i][f]!=-1)return dp[i][f];
        
        long take=0;
        //if parity is same
        if((f==0 && nums[i]%2==0) || (f==1 && nums[i]%2==1)){
           take+=nums[i]+solve(i+1,nums,x,((nums[i]%2==0)?0:1),n,dp); 
        }
        
        //if parity not same
        else if((f==0 && nums[i]%2==1) || (f==1 && nums[i]%2==0)){
            take+=nums[i]-x+solve(i+1,nums,x,((nums[i]%2==0)?0:1),n,dp);
        }
        
        long not=solve(i+1,nums,x,f,n,dp);
        
        return dp[i][f]=Math.max(take,not);
    }
}