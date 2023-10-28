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
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxXor(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
public int maxXor(int arr[], int n)  
{  
    //We use gaussian elimination method.
    
    int index = 0;
    
    for(int i=31; i>=0; i--){
        
        int maxelement = Integer.MIN_VALUE;
        int maxindex = index;
        
        //We find the largest number with set bit at ith position.
        for(int j=index; j<arr.length;j++){
            
            int setbit = (arr[j]>>i) & 1;
            
            if(setbit!=0 && maxelement<arr[j]){
                maxelement = arr[j];
                maxindex = j;
            }
        }
        
        //If there is no maxelement.
        if(maxelement==Integer.MIN_VALUE){
            continue;
        }
        
        //Replace max element with index
        int temp = arr[index];
        arr[index] = arr[maxindex];
        arr[maxindex] = temp;
        
        //replace maxindex with index
        maxindex = index;
        
        //xor all elements with maxelement that have set bit at ith position.
        for(int j=0; j<n;j++){
            
            int setbit = (arr[j]>>i) & 1;
            
            if(setbit!=0 && j!=maxindex){
                arr[j] = arr[j]^arr[maxindex];
            }
        }
        
        index++;
        
    }
    int res = 0;
    
    for(int i: arr){
        
        res = res^i;
    }
    
    return res;
    
    
    
    
    
}  
}