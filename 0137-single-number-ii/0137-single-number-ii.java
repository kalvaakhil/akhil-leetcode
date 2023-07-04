class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int ans=-1;
        for(int i:nums){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        for(int i:hmap.keySet()){
            if(hmap.get(i)==1){
                return i;
            }
        }
        return ans;
    }
}