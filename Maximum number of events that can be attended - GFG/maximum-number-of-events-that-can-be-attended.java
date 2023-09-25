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
            String S2[] = read.readLine().split(" ");
            int[] start = new int[N];
            int[] end = new int[N];
            
            for(int i=0; i<N; i++)
            {
                start[i] = Integer.parseInt(S1[i]);
                end[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxEvents(start,end,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
 static class pair{
       int s;
       int e;
       pair(int s,int e){
           this.s=s;
           this.e=e;
       }
   }
   static int maxEvents(int[] start, int[] end, int N) {
       pair[] arr = new pair[N];
       
      for(int i=0;i<N;i++){
          arr[i] = new pair(start[i],end[i]);
      }
      
      //sort based on start date
      Arrays.sort(arr,(a,b) ->(a.s - b.s));
       
   PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
   
   int ans=0,d=0,i=0;
   
   while(i<N || !pq.isEmpty()){
       //fetch the start date
       if(pq.isEmpty()){
           d= arr[i].s;
       }
       
       //max event can attend by start date 
       // update pq based on end date , here we need to attend event which takes less time to complete
       //we can attened event  any days between start[i]<=d <= end[i]
       while(i<N && arr[i].s <= d){
           pq.offer(arr[i].e);
           i++;
       }
       
       //once you attended the event soon , then remove it from the pq
       pq.poll();
       
       ++ans ;
       ++d; // update the days once you attended
       // if events overlaps or days already occupied 
       //then simply discard it
       
       while(!pq.isEmpty() && pq.peek() < d){
           pq.poll();
       }
       
       
       
   }
   return ans;  
   }
};