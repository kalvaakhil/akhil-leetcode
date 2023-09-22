class Solution {
    public boolean isSubsequence(String s, String t) {
        // boolean ans=false;
        int c=0;
        int sl=s.length(),tl=t.length();
        int j=0;
        for(int i=0;i<tl;i++){
            if(j==sl)
                break;
            if(t.charAt(i)==s.charAt(j)){
                System.out.println(t.charAt(i));
                c++;
                j++;
            }
        }
        return c==sl;
    }
}