//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    vector<int> subarraySum(vector<int>arr, int n, long long s)
    {
        // Your code here
        if(s==0) return {-1};
        long long int l=0,r=0,sum=0;
        while(r<n || l<n){
            if(sum==s) return {l+1,r};
            else if(sum<s && r<n) {sum+=arr[r];r++;}
            else {sum-=arr[l];l++;}
            if(l>r) break;
        }
        
        return {-1};
    }
};

//{ Driver Code Starts.

int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        long long s;
        cin>>n>>s;
        vector<int>arr(n);
        // int arr[n];
        const int mx = 1e9;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        Solution ob;
        vector<int>res;
        res = ob.subarraySum(arr, n, s);
        
        for(int i = 0;i<res.size();i++)
            cout<<res[i]<<" ";
        cout<<endl;
        
    }
	return 0;
}
// } Driver Code Ends