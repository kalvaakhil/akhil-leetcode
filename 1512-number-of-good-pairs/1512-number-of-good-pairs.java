class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i:nums){
            if(hmap.containsKey(i)){
                c+=hmap.get(i);
                hmap.put(i,hmap.get(i)+1);
            }
            else{
                hmap.put(i,1);
            }
        }
        return c;
    }
}