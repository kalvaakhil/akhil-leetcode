class Solution {
    public int accountBalanceAfterPurchase(int p) {
        if(p%10==0){
            return 100-p;
        }
        int prev=p-10;
        int aft=p+10;
        while(true){
            if(prev%10==0){
                break;
            }
            prev+=1;
        }
        while(true){
            if(aft%10==0){
                break;
            }
            aft-=1;
        }
        int diff1=Math.abs(p-prev);
        int diff2=Math.abs(p-aft);
        int ans=0;
        System.out.println(diff1+" "+diff2);
        if(diff1>diff2){
            ans=100-aft;
        }
        else if(diff1<diff2){
            ans=100-prev;
        }
        else{
            ans=100-Math.max(prev,aft);
        }
        return ans;
    }
}