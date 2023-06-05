class Solution {
    public int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
        
        int[] nums = new int[timePoints.size()];
    
        for(int i = 0;i<nums.length;i++){
            String s = timePoints.get(i);
             
            nums[i] = Integer.parseInt(s.substring(0,2)) * 60 + Integer.parseInt(s.substring(3,5));
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(j != i){
                    min = Math.min(min,Math.abs(nums[i]+1440 - nums[j]));
                    min = Math.min(min,Math.abs(nums[j]-nums[i]));
                }
                
            }
            
        }
        return min;
    }
}