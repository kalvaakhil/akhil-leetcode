class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        
        char startRow = s.charAt(0);
        char startCol = s.charAt(1);
        char endRow = s.charAt(3);
        char endCol = s.charAt(4); 

        while(startRow <=endRow) {
            while(startCol <= endCol) {
                ans.add(startRow + "" + startCol);
                startCol++;
            }
            startCol = s.charAt(1);
            startRow++;
        }
        return ans;
    }
}