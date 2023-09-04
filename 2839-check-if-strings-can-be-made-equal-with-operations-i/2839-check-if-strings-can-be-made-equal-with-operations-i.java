class Solution {
    public static  boolean check(char arr1[],char arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public boolean canBeEqual(String s1, String s2) {
        char t1[]=s1.toCharArray();
        char t2[]=s2.toCharArray();
        if(check(t1,t2)==false){
            return false;
        }
        char arr1[]=new char[3];
        char arr2[]=new char[3];
        for(int i=0;i<4;i+=2){
            arr1[i]=s1.charAt(i);
            arr2[i]=s2.charAt(i);
        }
        if(check(arr1,arr2)){
            return true;
        }
        return false;
        
        

    }
}