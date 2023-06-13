class Solution {
    public boolean check(String s){
        boolean flag=true;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return flag;
        
    }
    public String makeSmallestPalindrome(String s) {
        int i=0,j=s.length()-1;
        char arr[]=new char[j+1];
        for(int ik=0;ik<=j;ik++){
            arr[ik]=s.charAt(ik);
        }
        while(i<j){
            if(arr[i]!=arr[j]){
                if(arr[i]>arr[j]){
                    arr[i]=arr[j];
                }
                else{
                    arr[j]=arr[i];
                }
                String x=new String(arr);
                // System.out.println(x);
                if(check(x)){
                    break;
                }
            }
                i++;
                j--;
        }
        String ans=new String(arr);
        return ans;

    }
}