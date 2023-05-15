class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        
        for (int num1: nums1){
            for (int num2: nums2){
                if (!hm.containsKey(num1+num2)){
                    hm.put(num1+num2, 0);
                }
                hm.put(num1+num2, hm.get(num1+num2)+1);
            }
        }

        int count=0;

        for (int num3: nums3){
            for (int num4: nums4){
                if (hm.containsKey(-(num3+num4))){
                    count += hm.get(-(num3+num4));
                }
            }
        }

        return count;
    }
}