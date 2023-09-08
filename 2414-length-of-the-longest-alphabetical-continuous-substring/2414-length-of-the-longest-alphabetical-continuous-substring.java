class Solution {
    public int longestContinuousSubstring(String s) {
        // initialize variables
        char lastChar = s.charAt(0);
        int start = 0;
        int res = 0;
        char [] chars = s.toCharArray();
        
        // loop through each character of the string
        for(int i = 1; i < chars.length; i++){
            // if current character is one more than the previous character in ASCII order
            if(chars[i] == lastChar + 1){
                lastChar = chars[i];
            }
            // otherwise, reset the start index and update the longest length seen so far
            else{
                res = Math.max(res, i - start);
                lastChar = chars[i];
                start = i;
            }
        }
        // handle the case where the longest substring is at the end of the string
        res = Math.max(res, chars.length - start);
        // return the longest length seen
        return res;
    }
}