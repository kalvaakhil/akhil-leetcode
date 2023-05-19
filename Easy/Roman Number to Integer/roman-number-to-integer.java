//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution 
{
    public int romanToDecimal(String str) 
    {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
    
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int targetIdx = str.length()-1; 
        
        int decimalValue = map.get(str.charAt(targetIdx--));
        for(int curr, next; targetIdx >=0; targetIdx--)
        {
            curr = map.get(str.charAt(targetIdx));
            next = map.get(str.charAt(targetIdx+1));
            
            decimalValue += curr < next ? (-curr) : curr;
        }
        
        return decimalValue;
    }
}

