//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

int minOps(int a[], int n);

int main() {
    long long t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++)cin>>a[i];
        cout<<minOps(a, n)<<endl;
    }
	return 0;
}
// } Driver Code Ends


int minOps(int a[], int n)
{
    int j=n;
    for(int i=n-1;i>=0;i--)
    {
        if(a[i]==j){
            j--;
        }
    }
    return j;
}