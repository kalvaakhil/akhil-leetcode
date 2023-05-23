class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
        int temp[]=new int[m+n];
        int i=0,j=0,ind=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                temp[ind]=arr1[i];
                i++;
                ind++;
            }
            else{
                temp[ind]=arr2[j];
                j++;
                ind++;
            }
        }
        while(i<n){
            temp[ind++]=arr1[i++];
        }
        while(j<m){
            temp[ind++]=arr2[j++];
        }
        for (i = 0; i < n + m; i++) {
            arr1[i]=temp[i];}
    }
}