class Solution {
    public static int  searchindex(int [] arr,int s,int e,int key){
        int mid=(s+e)/2;
        if(s>e){
            return -1;
        }
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
        return searchindex(arr,s,mid-1,key);
        }
        return searchindex(arr,mid+1,e,key);
    }
    public int search(int[] arr, int target) {
        return searchindex(arr,0,arr.length-1,target);
    }
}