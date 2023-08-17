//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
//User function template for C++
class Solution{
public:
   string solve(string temp,int n){
       if(n%2==0){
           string s=temp.substr(0,n/2);
           string val=s;
           reverse(s.begin(),s.end());
           string final=val+s;
           if(temp<final) return final;
           else{
               int j=val.size()-1;
               while(val[j]=='9'){
                   val[j]='0';
                   j--;
               }
               if(j==-1){
                    val.pop_back();
                  // cout<<val<<endl;
                   return final='1'+val+'0'+val+'1';
               }
               else{
                   val[j]=val[j]+1;
                   final=val;
                   reverse(val.begin(),val.end());
                   return final+val;
               } 
           }
       }
       else{
           string s=temp.substr(0,n/2+1);
           string val=s;
           s.pop_back();
           reverse(s.begin(),s.end());
           string final=val+s;
           if(temp<final) return final;
           else{
               int j=val.size()-1;
               while(val[j]=='9'){
                   val[j]='0';
                   j--;
               }
               if(j==-1){
                   val.pop_back();
                  // cout<<val<<endl;
                   return final='1'+val+val+'1';
               }
               else{
                   val[j]=val[j]+1;
                   final=val;
                   val.pop_back();
                   reverse(val.begin(),val.end());
                   return final+val;
               } 
           }
       }
       return "";
   }
vector<int> generateNextPalindrome(int arr[], int n) {
  string temp="";
  for(int i=0;i<n;i++){
      temp+=to_string(arr[i]);
  }
  string t=solve(temp,n);
  vector<int>ans;
  for(int i=0;i<t.size();i++){
      ans.push_back(t[i]-'0');
  }
  return ans;
}

};

//{ Driver Code Starts.


int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int num[n];
        for (int i = 0; i < n; i++) {
            cin >> num[i];
        }
        Solution ob;
        auto ans = ob.generateNextPalindrome(num, n);
        for (auto x : ans) {
            cout << x << " ";
        }
        cout << "\n";
    }
    return 0;
}

// } Driver Code Ends