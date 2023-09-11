//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans[]=ob.smallerSum(n,a);
            for(long i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public static int fun(int[] arr,int t,int n){
        int sum=0;
        int i=0,j=n-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]==t)return mid;
            if(arr[mid]<t)i=mid+1;
            else j=mid-1;
        }
        return i;
    }
    public long[] smallerSum(int n,int arr[])
    {
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        long[] temp=new long[n];
        long[] dump=new long[n];
        dump[0]=0;
        long x=0;
        for(int i=0;i<n-1;i++){
            if(arr1[i]!=arr1[i+1]){
                dump[i+1]=dump[i]+x+arr1[i];
                x=0;
            }
            else{
                x+=arr1[i];
                dump[i+1]=dump[i];
            }
            //System.out.println(dump[i]);
        }
       
        for(int i=0;i<n;i++){
            int k=fun(arr1,arr[i],n);
             temp[i]=dump[k];
           // System.out.println(k+" "+arr[i]+" "+temp[i]+" "+dump[k]);
           
        }
        return temp;
    }
}
