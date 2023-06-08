class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int n[]:grid){
            for(int j=n.length-1;j>=0;j--){
                if(n[j]<0)
                    c++;
                else
                    break;
            }
        }
            return c;
    }
}