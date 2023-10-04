//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution
{
  public:
  string smallestNumber(string num)
{ 
    int n=num.length();
    //code here.
    int arr[n];
    int midx=n-1,idx=0;
    for(int i=n-1;i>=0;i--){
        if(num[idx]>num[i] && num[i]!='0')idx=i;
        if(num[midx]>num[i]){
            midx=i;
        }
        arr[i]=midx;
    }
    if(idx!=0){swap(num[idx],num[0]);return num;}
    for(int i=1;i<n;i++){
        if(num[i]>num[arr[i]]){swap(num[i],num[arr[i]]);break;}
    }
    return num;
}
 
};

//{ Driver Code Starts.
int main(){
    int t;
    cin >> t;
    while(t--){
       string s;
       cin >> s;
       Solution ob;
       cout <<ob.smallestNumber(s) << endl;
    }
return 0;
}


// } Driver Code Ends