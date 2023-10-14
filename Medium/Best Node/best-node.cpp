//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


class Array
{
public:
    template <class T>
    static void input(vector<T> &A,int n)
    {
        for (int i = 0; i < n; i++)
        {
            scanf("%d ",&A[i]);
        }
    }

    template <class T>
    static void print(vector<T> &A)
    {
        for (int i = 0; i < A.size(); i++)
        {
            cout << A[i] << " ";
        }
        cout << endl;
    }
};


// } Driver Code Ends
class Solution {
  public:
long long bestNode(int N, vector<int> &A, vector<int> &P) {
        // code here
        int dp[N+1];
        for(int i=1;i<=N;i++) dp[i]=0;
        for(int j=1;j<N;j++) dp[P[j]]++;
        long long mx=INT_MIN;
        for(int i=1;i<=N;i++){
            if(dp[i]==0){
                int j=i;
                long long temp=0;
                while(j!=-1){
                    temp+=A[j-1];
                    j=P[j-1];
                    mx=max(mx,temp);
                    temp*=-1;
                }
            }
        }
        return mx;

}
};


//{ Driver Code Starts.

int main(){
    int t;
    scanf("%d ",&t);
    while(t--){
        
        int N;
        scanf("%d",&N);
        
        
        vector<int> A(N);
        Array::input(A,N);
        
        
        vector<int> P(N);
        Array::input(P,N);
        
        Solution obj;
        long long res = obj.bestNode(N, A, P);
        
        cout<<res<<endl;
        
    }
}

// } Driver Code Ends