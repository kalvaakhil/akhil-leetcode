class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int n[]:grid){
            for(int j:n){
                if(j<0){
                    c+=1;
                }
            }
        }
        return c;
    }
}