//{ Driver Code Starts

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends



class Solution {
public:
    int Count(vector<vector<int> >& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 1){
                    int zeros = 0;
                    for(int p = -1; p <= 1; p++){
                        for(int q = -1; q <= 1; q++){
                            int nrow = i + p;
                            int ncol = j + q;
                            if(nrow >= 0 and nrow < n && ncol >= 0 && ncol < m && matrix[nrow][ncol] == 0){
                                zeros++;
                            }
                        }
                    }
                    if(zeros > 0 && zeros % 2 == 0){
                        ans++;
                    }
                }        
            }
        }
        
        return ans;
    }
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<int>> matrix(n, vector<int>(m,0));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				cin >> matrix[i][j];
			}
		}
		Solution ob;
		int ans = ob.Count(matrix);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends