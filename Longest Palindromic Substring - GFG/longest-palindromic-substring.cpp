//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function template for C++

class Solution{   
public:
    string longestPalindrome(string s){
        int n = s.size();
        vector<vector<int>> dp(n,vector<int>(n,-1));
        for (int i = 0; i < n ; i++) dp[i][i] = 1; //single palindrome

        int maxLength = 0; int outputi = 0; int outputj = 0;
        for (int i = 0; i < n-1; i++) {
            if (s[i] == s[i+1]) {
                dp[i][i+1] = 1;
                if (maxLength == 0){
                    outputi = i;
                    outputj = i+1;
                }
                maxLength = 2;
            }
            else dp[i][i+1] = 0;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (dp[i][j] >= 0) continue;
                dp[i][j] = check(s,i,j,dp);
                if (dp[i][j] == 1 and abs(j - i) + 1 > maxLength){
                    outputi = i;
                    outputj = j;
                    maxLength = abs(j - i) + 1;
                }
            }
        }
        string output = "";
        for (int i = outputi; i <= outputj; i++){
            output += (s[i]);
        }
        return output;
    }
    
    bool check(string &s, int start, int end, vector<vector<int>> &dp){
        if (start > end) return 0;
        if (dp[start][end] != -1) return dp[start][end];
        return ((s[start] == s[end]) and check(s,start + 1, end - 1, dp));
    }
};

//{ Driver Code Starts.



int main(){
    int t;
    cin>>t;
    while(t--){
        string S;
        cin>>S;
        Solution ob;
        cout<<ob.longestPalindrome(S)<<endl;
    }
    return 0;
}

// } Driver Code Ends