class Solution{
    public int maxPower(String s){
        int ans = 0;
        int k = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) k++;
            else k=0;
            ans = Math.max(ans, k);
        }
        return Math.max(ans, k)+1;
    }
}