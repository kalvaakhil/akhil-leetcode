//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution{   
public:
    int numberOfConsecutiveOnes(int N){
        
        int countend0=1,countend1=1,sum=countend0+countend1;
        for(int i=2;i<=N;i++){
            countend1=(countend0);
            countend0=sum;
            sum=(countend1+countend0);
        }
        return pow(2,N)-sum;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.numberOfConsecutiveOnes(N) << endl;
    }
    return 0; 
} 

// } Driver Code Ends