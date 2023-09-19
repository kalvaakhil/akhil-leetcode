class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        for(int i:nums){
            if(hset.contains(i)){
                return i;
            }
            hset.add(i);
        }
        return -1;
    }
}