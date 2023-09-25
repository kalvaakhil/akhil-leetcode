//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            int ans = ob.count(N, A, X); 
            System.out.println(ans);
        }
    } 
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
   int count(int N, int A[], int X) 
   {   
       
 int [] bits = new int[32];  Arrays.fill(bits , 0);
  for(int i:A)
   for(int j=0 ;j<32;j++) {
    if((i&(1<<j))==0)
     bits[j]++;
   }
   int mincount =N;
   int shift=31;
   for(int i=31;i>=0;i--)
    if(bits[i]<N)
      shift = 31;
   while(shift>length(X)-1) {
    if(mincount>bits[shift])
     mincount = bits[shift];
    shift--;
   }
   // System.out.println(mincount);
//    int shift = length(X)-1;
   int precount=0;
   while(shift>=0) {
     if(bits[shift]!=0) {
       int count =0;
       if((X&(1<<shift))>0){
        for(int i=0 ;i<N;i++) {
         if(A[i]>0)
          if((A[i]&(1<<shift))==0) {
           count++;
           A[i]=-A[i];
          }
        }
        precount =precount+count;
        count = precount ;
       //  System.out.println("X>0 at index="+shift+" count= "+count+" precount =" +precount);
        }
       else {
         for(int i=0 ;i<N;i++) {
         if(A[i]>=0)
          if((A[i]&(1<<shift))==0) {
           count++;
          }
        }
         count = count +precount ;
         if(count<mincount)
             mincount=count;
       //   System.out.println("X<0 at index="+shift+" count= "+count+" precount= "  + precount);
       }
    }
     else {
       if((X&(1<<shift))==0){
        if(precount<mincount)
         mincount=precount;
        break;
       }
      }
    shift--;
   }
//  System.out.println("mincount= "+mincount);
return mincount;
 }
static int length(int a) {
return (int)(Math.log(a)/Math.log(2))+1;
}

    
} 

