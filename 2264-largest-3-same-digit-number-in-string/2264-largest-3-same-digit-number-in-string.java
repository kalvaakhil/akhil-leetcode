class Solution {
    public boolean isUnique(String t){
        boolean ans=true;
        for(int i=0;i<t.length()-1;i++){
            char x=t.charAt(i);
            char y=t.charAt(i+1);
            if(x!=y){
                return false;
            }
        }
        return ans;
    }
    public String largestGoodInteger(String num) {
        int n=num.length();
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n-2;i=i+1){
            String t=num.substring(i,i+3);
            System.out.println(t);
            if(isUnique(t)){
                ans=Math.max(ans,Integer.valueOf(t));
            }
        }
        if(ans<0){
            return "";
        }
        String a=String.valueOf(ans);
        if(a.length()<3 && a.charAt(0)=='0'){
            a="000";
        }
        return a;
    }
}