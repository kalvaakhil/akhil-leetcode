//{ Driver Code Starts
/* Driver program to test above function */

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
public:
 int maxSubStr(string str)
    {
        int sum=0;
        int count=0;
        int end=-1;
        int n=str.size() ;
        for(int i=0;i<str.size();i++)
        {
            if(str[i]=='1')
            sum++;
            else
            sum-- ;
            
            if(sum==0)
            {
                count++ ;
                end=i;
            }
            
        }
        if(end!=n-1) return -1 ;
        return count;
    }
};


//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    string str;
	    cin >> str;
	    Solution ob;
	    int ans = ob.maxSubStr(str);
	    cout << ans<<endl;
	}
	return 0;
}

// } Driver Code Ends