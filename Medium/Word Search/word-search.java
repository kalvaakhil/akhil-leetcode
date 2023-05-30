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
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{ 
public boolean fun(int i,int j,int ind,int vis[][],char b[][],String w,int n,int m){ 
        if(ind==w.length())return true;  
        if(i<0 || j<0 || i>=n || j>=m)return false;
        if(vis[i][j]==0 && b[i][j]==w.charAt(ind)){ 
            vis[i][j]=1; 
           if(fun(i-1,j,ind+1,vis,b,w,n,m)|| fun(i+1,j,ind+1,vis,b,w,n,m)||fun(i,j-1,ind+1,vis,b,w,n,m)||fun(i,j+1,ind+1,vis,b,w,n,m))return true; 
             vis[i][j]=0;
        }  
        return false;
    } 
    
    
    public boolean isWordExist(char[][] b, String w)
    {
        // Code here 
        int n=b.length; 
        int m=b[0].length; 
        int vis[][]=new int[n][m]; 
        for(int i[]:vis)Arrays.fill(i,0); 
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){ 
                if(fun(i,j,0,vis,b,w,n,m))return true; 
            } 
        } 
        return false;
    }
}