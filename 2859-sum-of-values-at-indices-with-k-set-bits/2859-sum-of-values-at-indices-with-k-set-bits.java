class Solution {
    public int getCount(String x){
        int c=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count=0,n=nums.size();
        for(int i=0;i<n;i++){
            int x=nums.get(i);
            String xt=Integer.toBinaryString(i);
            int c=getCount(xt);
             System.out.println(c);
            if(c==k){
                count+=x;
            }
        }
        return count;
    }
}