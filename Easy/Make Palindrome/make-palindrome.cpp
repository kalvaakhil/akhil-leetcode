//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
bool makePalindrome(int n,vector<string> &arr){
        // Code here
        map<string,int>m;
        
        for(auto i:arr)
        {
            m[i]++;
        }
        int cnt=0;
        for(auto it:m)
        {
            string str = it.first;
            reverse(str.begin(), str.end());
            
            if(str==it.first && it.second&1) cnt++;
        }
        
        if(cnt>1) return false;
        
        for(auto it:m)
        {
            string str = it.first;
            reverse(str.begin(), str.end());
            
            if(it.second!=m[str]) return false;
        }
        return true;
        
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<string> arr(n);
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        Solution ob;
        if(ob.makePalindrome(n,arr)) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
    return 0;
}
// } Driver Code Ends