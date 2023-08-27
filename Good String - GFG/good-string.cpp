//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
string isGoodString(string s);
int main()
{
	int t;
	cin>>t;
	while(t--)
	    {
	       string s;
	       cin>>s;
	       cout<<isGoodString(s)<<endl;
	    }
}	    
	    
// } Driver Code Ends


string isGoodString(string s)  {
    for(int i=1; i<s.length(); i++) {
        if((s[i] == 'z' and s[i-1] =='a') or (s[i-1] == 'z' and s[i] == 'a'))
            continue;
        if(abs(s[i-1] - s[i]) != 1)
            return "NO";
    }
    return "YES";
}

