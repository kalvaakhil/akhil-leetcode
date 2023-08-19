//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution{
    public:
    int maxOnes(int a[], int n)
    {
        // Your code goes here
                int one=0,zero=0,count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                zero++;
            }
            if(a[i]==1)
            {
                one++;
                if(zero>0)
                {
                    zero--;
                }
            }
            count=max(zero,count);
        }
        return count+one;
    }
};


//{ Driver Code Starts.
int main()
{
    int t; cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n+5];
        for(int i=0;i<n;i++)
            cin>>a[i];
        Solution ob;
        cout<< ob.maxOnes(a, n) <<endl;
    }
    return 0;
}

// } Driver Code Ends