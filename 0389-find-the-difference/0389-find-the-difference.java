class Solution {
    public char findTheDifference(String s, String t) {
        char sar[]=s.toCharArray();
        char tar[]=t.toCharArray();
        Arrays.sort(sar);
        Arrays.sort(tar);
        for(int i=0;i<s.length();i++){
            if(sar[i]!=tar[i]){
                return tar[i];
            }
        }
        return tar[t.length()-1];
    }
}