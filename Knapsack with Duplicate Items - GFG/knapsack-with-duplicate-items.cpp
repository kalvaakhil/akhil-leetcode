//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
       int solve(int n,int w,int val[], int wt[],vector<vector<int>>&dp){
           
            if(n==0){
                return (w/wt[n])*val[n];
                
            }
              if(dp[n][w]!=-1)return dp[n][w];
              int ntake=solve(n-1,w,val,wt,dp);
               int take=-1e9;
               if(wt[n]<=w)take=val[n]+solve(n,w-wt[n],val,wt,dp);
                
                 return dp[n][w]= max(ntake,take);
       }
    int knapSack(int N, int W, int val[], int wt[])
    {
          vector<vector<int>>dp(N,vector<int>(W+1,-1));
          return solve(N-1,W,val,wt,dp);
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N, W;
        cin>>N>>W;
        int val[N], wt[N];
        for(int i = 0;i < N;i++)
            cin>>val[i];
        for(int i = 0;i < N;i++)
            cin>>wt[i];
        
        Solution ob;
        cout<<ob.knapSack(N, W, val, wt)<<endl;
    }
    return 0;
}
// } Driver Code Ends