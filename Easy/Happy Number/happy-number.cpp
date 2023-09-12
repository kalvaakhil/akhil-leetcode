//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std;

// } Driver Code Ends



class Solution{
public:
int sum(int n)//to find sum of square of digits.
    {
        int rem=0;
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum = sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
    int isHappy(int n){
        // code here
        if(n==1)   return 1;
        set<int> set;
        while(n!=1)
        {
            n=sum(n);
            if(set.find(n) != set.end())
            {
                return 0;
            }
            else
            {
                set.insert(n);
            }
            if(n==1)
            return 1;
        }
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
        cin>>N;
        Solution ob;
        cout << ob.isHappy(N) << endl;
    }
    return 0; 
}
// } Driver Code Ends