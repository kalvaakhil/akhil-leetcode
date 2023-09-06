class Solution {
    public static  boolean check(char arr1[],char arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public boolean checkStrings(String s1, String s2) {
        char t1[]=s1.toCharArray();
        char t2[]=s2.toCharArray();
        if(check(t1,t2)==false){
            return false;
        }
        char arr1[]=new char[s1.length()];
        char arr2[]=new char[s2.length()];
        for(int i=0;i<s1.length();i+=2){
            arr1[i]=s1.charAt(i);
            arr2[i]=s2.charAt(i);
        }
        if(check(arr1,arr2)){
            return true;
        }
        return false;
    }
}
        // int n=s1.length();
        // int x=n/2;
        // char arr1[]=new char[x+2];
        // char arr2[]=new char[x+2];
        // for(int i=0;i<n;i+=2){
        //     arr1[i]=s1.charAt(i);
        //     arr2[i]=s2.charAt(i);
        // }
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // boolean a1=Arrays.equals(arr1,arr2);
        // char arr3[]=new char[x+3];
        // char arr4[]=new char[x+3];
        // for(int i=1;i<n;i+=2){
        //     arr3[i]=s1.charAt(i);
        //     arr4[i]=s2.charAt(i);
        // }
        // Arrays.sort(arr3);
        // Arrays.sort(arr4);
        // boolean a2=Arrays.equals(arr3,arr4);
        // return a1&&a2;