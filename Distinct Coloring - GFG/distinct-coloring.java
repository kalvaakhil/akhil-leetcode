//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
     public static long distinctColoring(int N, int[]r, int[]g, int[]b){

        //code here

        int colors[][] = new int[N][3];

        for(int i=0; i<N; i++){

            for(int j=0; j<3; j++){

                if(j==0) // 0th column represent red color

                colors[i][j] = r[i];

                if(j==1) // first column represent green color

                colors[i][j] = g[i];

                if(j==2) // second column represent blue color

                colors[i][j] = b[i];

            }

        }

         long dp[][] = new long[N][4];

         for(long a[]: dp) Arrays.fill(a, -1);

         return f(N-1, 3, colors, dp);

    }

    static long f(int day, int last, int[][] colors, long[][] dp) {

 

        if (dp[day][last] != -1) return dp[day][last];

 

        if (day == 0) {

            long mini = Long.MAX_VALUE;

            for (int i = 0; i < 3; i++) {

                if (i != last)

                    mini = Math.min(mini, colors[0][i]);

            }

            return dp[day][last] = mini;

        }

 

        long mini = Long.MAX_VALUE;

        for (int i = 0; i < 3; i++) {

            if (i != last) {

                long activity = colors[day][i] + f(day - 1, i, colors, dp);

                mini = Math.min(mini, activity);

            }

 

        }

        return dp[day][last] = mini;

    }
}


//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input[] = read.readLine().trim().split("\\s+");
            int[]r=new int[N];
            for(int i=0;i<N;i++)
                r[i]=Integer.parseInt(input[i]);
            input = read.readLine().trim().split("\\s+");
            int[]g=new int[N];
            for(int i=0;i<N;i++)
                g[i]=Integer.parseInt(input[i]);
            input = read.readLine().trim().split("\\s+");
            int[]b=new int[N];
            for(int i=0;i<N;i++)
                b[i]=Integer.parseInt(input[i]);

            Solution ob = new Solution();
            out.println(ob.distinctColoring(N, r, g, b));
        }
        out.close();
    }
}
// } Driver Code Ends