//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;


class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			 ArrayList<Integer> ans = new ArrayList<Integer>();
			 ans = new Solution().sortByFreq(arr, size);
			 for(int i=0;i<ans.size();i++)
			    System.out.print(ans.get(i)+" ");
		    System.out.println();
			n--;
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class ArrayItem
{
    int item;
    int freq;
    ArrayItem(int item,int freq)
    {
        this.item = item;
        this.freq = freq;
    }
}
class Solution
{
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        TreeMap<Integer,Integer> hmap = new TreeMap<>();
        for(int item: arr)
        {
            hmap.put(item,hmap.getOrDefault(item,0)+1);
        }
        ArrayList<ArrayItem> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet())
        {
            result.add(new ArrayItem(entry.getKey(),entry.getValue()));
        }
        Collections.sort(result,(a,b)->(b.freq-a.freq));
        ArrayList<Integer> ans = new ArrayList<>();
        for(ArrayItem entry:result)
        {
            for(int i = 0;i<entry.freq;i++)
            {
                ans.add(entry.item);
            }
        }
        return ans;
        
    }
}