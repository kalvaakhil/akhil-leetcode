//{ Driver Code Starts


#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution {
  public:
long long noOfGroups(int N , int Arr[]) {
       long long int ans=0;
      map<long long int,long long int>mp;
       for(int i=0;i<N;i++){
           mp[Arr[i]%3]++;
       }
      ans=ans+(mp[0]*(mp[0]-1))/2;
       ans=ans+(mp[1]*mp[2]);
       ans=ans+(mp[0]*mp[1]*mp[2]);
       ans=ans+(mp[0]*(mp[0]-1)*(mp[0]-2))/6;
       ans=ans+(mp[1]*(mp[1]-1)*(mp[1]-2))/6;
       ans=ans+(mp[2]*(mp[2]-1)*(mp[2]-2))/6;
       return ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;
        int Arr[N];
        
        for(int i=0 ; i<N ; i++)
            cin>>Arr[i];

        Solution ob;
        cout << ob.noOfGroups(N,Arr) << endl;
    }
    return 0;
}
// } Driver Code Ends