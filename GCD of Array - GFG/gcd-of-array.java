//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N = sc.nextInt();
                    int Arr[] = new int[N];
                    for(int i = 0;i<N;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(N,Arr));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int gcd(int a,int b){
        while((a>0)&(b>0)){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a>0){
            return a;
        }
        return b;
    }
    public int gcd(int N , int arr[]) 
    { 
        int c=0;
        if(N<=1){
            return arr[0];
        }
        int ans=gcd(arr[0],arr[1]);
        for(int i=2;i<N;i++){
            ans=gcd(ans,arr[i]);
        }
        return ans;
    } 
}