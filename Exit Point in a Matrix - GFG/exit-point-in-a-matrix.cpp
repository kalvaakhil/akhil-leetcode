//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
public:
vector<int> FindExitPoint(vector<vector<int>>&matrix){
        // Code here
        vector<int> v;
        char e='n';
        int n = matrix.size(),t=matrix[0].size(),i=0,j=0;
        while((i<n && i>=0) && (j<t && j>=0)){
           if(matrix[i][j]==1)
                 {matrix[i][j]=0;
                  if(e=='n' || e=='w')
                      {i++;
                      e='d';}
                  else if(e=='d')
                      {j--;
                       e='e';}
                  else if(e=='e')
                      {i--;
                       e='u';}
                  else if(e=='u')
                      {j++;
                       e='w';}
                 }
           else if(matrix[i][j]==0)
                   {if(e=='n' || e=='w')
                       {j++;}
                    else if(e=='d')
                        i++;
                    else if(e=='e')
                        j--;
                   else if(e=='u')
                        i--;
                   }
        }
        if(i==n)
            i--;
        else if(i<0)
            i=0;
        if(j==t)
            j--;
        else if(j<0)
            j=0;
        v.push_back(i);
        v.push_back(j);
        return v;
    }
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<int>>matrix(n, vector<int>(m, 0));
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				cin >> matrix[i][j];
		Solution obj;
		vector<int> ans = obj.FindExitPoint(matrix);
		for(auto i: ans)
			cout << i << " ";
		cout << "\n";
	}
	return 0;
}
// } Driver Code Ends