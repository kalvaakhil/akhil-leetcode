//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Solution
{
    class Tuple  implements Comparable<Tuple>{
        int first , second, step;
        Tuple(int first, int second, int step){
            this.first = first;
            this.second = second;
            this.step = step;
        }
        public int compareTo(Tuple that){
            return this.step-that.step;
        }
    }
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        if(N==1 ) return 0;
        PriorityQueue<Tuple> qu = new PriorityQueue<>();
        boolean vis[][] = new boolean[N][N];
        
        fun(KnightPos);
        fun(TargetPos);
        
        int dx[] = {2, 2, -2, -2, 1, 1, -1, -1};
        int dy[] = {-1, 1, 1, -1, 2, -2, 2, -2};
        
        qu.add(new Tuple(KnightPos[0],KnightPos[1],0));
        vis[KnightPos[0]][KnightPos[1]]= true;
        
        while(!qu.isEmpty()){
            int row = qu.peek().first;
            int col = qu.peek().second;
            int step = qu.peek().step;
            
            qu.remove();
            for(int i=0; i<8; i++){
                int nrow = row + dx[i];
                int ncol = col + dy[i];
                
                if(nrow >= 0 && nrow < N && ncol >= 0 && ncol < N && 
                vis[nrow][ncol] == false){
                    if(nrow == TargetPos[0] && ncol == TargetPos[1]) {return ++step;}
                    vis[nrow][ncol] = true;
                    qu.add(new Tuple(nrow,ncol,step+1));
                }
            }
        }
        return -1;
    }
    
    void fun(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] - 1;
        }
    }
}