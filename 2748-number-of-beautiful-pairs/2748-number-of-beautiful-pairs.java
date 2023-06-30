class Solution {
    private int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a>0){
            return a;
        }
        return b;
    }
    private int getfirst(int n){
        int ls=0;
        while(n>0){
            ls=n%10;
            n/=10;
        }
        return ls;
    }
    public int countBeautifulPairs(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int ld=nums[j]%10;
                int fd=getfirst(nums[i]);
                if(gcd(ld,fd)==1){
                    c++;
                }
            }
        }
        return c;
    }
}