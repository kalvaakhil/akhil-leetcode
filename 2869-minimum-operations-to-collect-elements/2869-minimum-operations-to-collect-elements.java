class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int n=nums.size();
        int arr[]=new int[51];
        for(int i=n-1;i>=0;i--){
            boolean ans=true;
            arr[nums.get(i)]=1;
            for(int j=1;j<=k;j++){
                if(arr[j]==0)
                {
                    ans=false;
                    break;
                }
            }
            if(ans){
                return n-i;
            }
        }
        return -1;
    }
}