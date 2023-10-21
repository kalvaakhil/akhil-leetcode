//{ Driver Code Starts

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution{
	public:
	int power(int x, int n) {
        long long res = 1;
        while(n) {
            if(n & 1) {
                res = ( (res % 9) * (x % 9) ) % 9;
            }
            x = ( (x % 9) * (x % 9) ) % 9;
            n = n >> 1;
        }
        if(res == 0)
            return 9;
        return res;
	}
	int SumofDigits(int A, int B)
	{
	    int n = power(A, B);
	    return n;
	}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int A, B;
		cin >> A >> B;
		Solution ob;
		int ans = ob.SumofDigits(A, B);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends