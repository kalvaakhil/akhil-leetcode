class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            String x=Integer.toBinaryString(i);
            int c=0;
            for(int j=0;j<x.length();j++){
                if(x.charAt(j)=='1'){
                    c+=1;
                }
            }
            ans[i]=c;
        }
        return ans;    
    }
}