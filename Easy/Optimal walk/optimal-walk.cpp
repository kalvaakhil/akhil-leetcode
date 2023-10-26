//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
long long optimalWalk(long long N, long long A, long long B)
   {
       // code here
       vector<long long>dp(N+1);
       dp[0]=0;
       dp[1]=A;
       for(int i=2;i<=N;i++){
           dp[i]=min(A+dp[i-1],dp[(i+1)/2]+B+(i%2)*A);
       }
       return dp[N];
   }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        long long N, A, B;
        cin>>N>>A>>B;
        
        Solution ob;
        cout<<ob.optimalWalk(N, A, B)<<"\n";
    }
    return 0;
}
// } Driver Code Ends