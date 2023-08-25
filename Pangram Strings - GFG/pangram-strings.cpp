//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
	
	int isPanagram(string S)
	{
	    // Your code goes here 
	    unordered_map<char,int>mp;
	    
	    for(int i=0;i<S.length();i++){
	        char c= tolower(S[i]);
	        mp[c]++;
	    }
	    
	    for(char i='a';i<='z';i++){
	        if(mp[i]==0){
	            return 0;
	        }
	    }
	    return 1;
	}

};

//{ Driver Code Starts.

int main() 
{
   	

   	ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);
   
   	int t;
   	string tc;
   	getline(cin, tc);
   	t = stoi(tc);
   	while(t--)
   	{
   		string s;
   		getline(cin, s);

   	    Solution ob;

   		cout << ob.isPanagram(s) << "\n";
   	}

    return 0;
}
// } Driver Code Ends