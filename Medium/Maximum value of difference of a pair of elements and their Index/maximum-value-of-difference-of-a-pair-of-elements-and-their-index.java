//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
            {
                arr[i] = Integer.parseInt(S1[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxValue(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int maxValue(int[] arr, int n)
    {
        // code here
        if(n == 1) return 0;
        
        //Creating firstArray and secondArray to store max value and min value
        
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];
        
        //storing the values
        for(int i = 0; i < n; i++)
        {
            firstArray[i] = arr[i] + i;
            secondArray[i] = arr[i] - i;
        }
        
        //Find maximum and minimum value in firstArray
        int maxValue1 = Integer.MIN_VALUE;
        int minValue1 = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++)
        {
            maxValue1 = Math.max(maxValue1, firstArray[i]);
            minValue1 = Math.min(minValue1, firstArray[i]);
        }
        
        
//System.out.println("max value firstArray = "+maxValue1);
 
//System.out.println("min value firstArray = "+minValue1);
 
    //find maximum differnce in firstArray
int ans1 = maxValue1 - minValue1;
 
//System.out.println(ans1);
        
        //Find maximum and minmum value in seconArray
        int maxValue2 = Integer.MIN_VALUE;
        int minValue2 = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++)
        {
            maxValue2 = Math.max(maxValue2, secondArray[i]);
            minValue2 = Math.min(minValue2, secondArray[i]);
        }
       
        //System.out.println("max value secondArray = "+maxValue1);
 
//System.out.println("min value secondArray = "+minValue1);
 
    //find maximum differnce in firstArray
int ans2 = maxValue2 - minValue2;
//System.out.println(ans2);
 
//Maximum Differences between firstArray and SecondArray
int maximum = Math.max(ans1, ans2);
 
//print maximum differences
//System.out.println(maximum);
        
        return maximum;
    }
};