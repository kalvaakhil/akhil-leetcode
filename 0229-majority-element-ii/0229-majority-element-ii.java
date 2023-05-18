class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int le=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<le;i++){
            if(hmap.containsKey(nums[i])){
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
            else{
                hmap.put(nums[i],1);
            }
        }
        for(int key:hmap.keySet()){
            if(hmap.get(key)>le/3){
                a.add(key);
            }
        }
       return a; 
    }
}