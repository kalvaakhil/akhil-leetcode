//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends

class Solution
{
    static long merge(long left,  long mid, long right, long[] temp, long[] arr){
        long i=left, j=mid, k=left, inv_count=0;
        
        while (i <= mid - 1 && j <= right) {
            if (arr[(int) i] <= arr[(int) j]) {
                temp[(int) k++] = arr[(int) i++];
            } else {
                temp[(int) k++] = arr[(int) j++];
                inv_count += mid - i;
            }
        }

        while (i <= mid - 1) {
            temp[(int) k++] = arr[(int) i++];
        }
        while (j <= right) {
            temp[(int) k++] = arr[(int) j++];
        }

        for (i = left; i <= right; i++) {
            arr[(int) i] = temp[(int) i];
        }
        
        return inv_count;
    }
    static long mergeSort( long left, long right,long[] temp, long[] arr){
        long inversionCount=0;
        if(left == right) return 0;
        
            long mid=(left+right)/2;
            inversionCount += mergeSort(left,mid,temp,arr);
            inversionCount += mergeSort(mid+1,right,temp,arr);
            
            inversionCount += merge(left, mid+1, right, temp, arr);
        
        
        return inversionCount;
    }
    static long inversionCount(long arr[], long N)
    {
        long[] temp=new long[(int)N];
        return mergeSort(0,N-1,temp,arr);
    }
}