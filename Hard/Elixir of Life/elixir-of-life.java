//{ Driver Code Starts
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
                    String str = sc.next();
                 
                    Sol obj = new Sol();
                    System.out.println(obj.maxFrequency(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
   int maxFrequency(String S)
   {  
    //code here.
    int ans = 0;
    String prefix = "";
    String sufix = "";
    char ch = S.charAt(0);
    
    int last_index  = S.length();
    
   
     while(last_index > 0){
         last_index = S.lastIndexOf(ch, last_index-1);
         
         if(last_index == 0) return 1;
         
         int len = S.length() - last_index;
        prefix = S.substring(0, len);
        sufix = S.substring(last_index, S.length());
      
        if(prefix.equals(sufix)){
            break;
        }
     }
    
    int myIndex = 0;
    while(myIndex != -1){
        myIndex = S.indexOf(prefix, myIndex+1);
        ans++;
    }
    
       return ans; 
   }
}