//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
#define ll long long 
#define MOD 1000000007

int minMoves(int a[], int n, int k);

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n, k;
	    cin>>n>>k;
	    int a[n];
    	for(int i=0;i<n;i++)
    	    cin>>a[i];
	   
    	cout<<minMoves(a,n,k)<<"\n";
	}
	return 0;
}

// } Driver Code Ends


#define mod 1000000007
int minMoves(int a[], int n, int k)
{
    int operations=0;
    for(int i=1;i<n;i++){
        int diff=a[i]-a[i-1];
        if(diff>0){
                if(diff%k==0){
                operations=operations%mod+((diff/k))%mod;
                a[i]=a[i]-diff;
                }
                else{
                operations=operations%mod+(((diff+k)/k))%mod;
                a[i]=a[i]-(((diff+k)/k)*k);
                }
        }
    }
    return operations%mod;
}