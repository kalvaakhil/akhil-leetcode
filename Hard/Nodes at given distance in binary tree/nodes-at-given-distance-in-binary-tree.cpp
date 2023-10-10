//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// Tree Node
struct Node
{
    int data;
    Node* left;
    Node* right;
};

// Utility function to create a new Tree Node
Node* newNode(int val)
{
    Node* temp = new Node;
    temp->data = val;
    temp->left = NULL;
    temp->right = NULL;
    
    return temp;
}

// Function to Build Tree
Node* buildTree(string str)
{   
    // Corner Case
    if(str.length() == 0 || str[0] == 'N')
            return NULL;
    
    // Creating vector of strings from input 
    // string after spliting by space
    vector<string> ip;
    
    istringstream iss(str);
    for(string str; iss >> str; )
        ip.push_back(str);
        
    // Create the root of the tree
    Node* root = newNode(stoi(ip[0]));
        
    // Push the root to the queue
    queue<Node*> queue;
    queue.push(root);
        
    // Starting from the second element
    int i = 1;
    while(!queue.empty() && i < ip.size()) {
            
        // Get and remove the front of the queue
        Node* currNode = queue.front();
        queue.pop();
            
        // Get the current node's value from the string
        string currVal = ip[i];
            
        // If the left child is not null
        if(currVal != "N") {
                
            // Create the left child for the current node
            currNode->left = newNode(stoi(currVal));
                
            // Push it to the queue
            queue.push(currNode->left);
        }
            
        // For the right child
        i++;
        if(i >= ip.size())
            break;
        currVal = ip[i];
            
        // If the right child is not null
        if(currVal != "N") {
                
            // Create the right child for the current node
            currNode->right = newNode(stoi(currVal));
                
            // Push it to the queue
            queue.push(currNode->right);
        }
        i++;
    }
    
    return root;
}


// } Driver Code Ends
/* A binary Tree node
struct Node
{
    int data;
    struct Node *left, *right;
};
*/

class Solution
{
private:

public:

void parent(Node* root, Node* p,unordered_map<Node*,Node*>&mp,int target, Node* &t){
        if(!root) return;
        mp[root] = p;
        if(!t && root->data == target) t = root;           
        parent(root->left,root,mp,target,t);         
        parent(root->right,root,mp,target,t);
    }
    vector <int> KDistanceNodes(Node* root, int target , int k)
    {
        vector<int>ans;
        unordered_map<Node*,Node*>m;
        Node*tar=NULL;
        parent(root,NULL,m,target,tar);
        
        auto getlower=[](Node*r,int k,vector<int>&ans){
            
            if(!r)return;
            queue<pair<int,Node*>>q;
            q.push({0,r});
            while(!q.empty()){
                int key=q.front().first;
                Node* t=q.front().second;
                q.pop();
                if(key>k)return;
                if(key==k)ans.push_back(t->data);
                if(t->left)q.push({key+1,t->left});
                if(t->right)q.push({key+1,t->right});
            }
            
        };
        getlower(tar,k,ans);
        
// this while loop is for getting the node from the ancestors of the target node
        while(m[tar]!=NULL && k){
            Node *p=m[tar];
            k--;
            if(k==0){
                ans.push_back(p->data);
                break;
            }
            if(p->left && p->left!=tar)getlower(p->left,k-1,ans);
            if(p->right && p->right!=tar) getlower(p->right,k-1,ans);
            tar=p;
        }
        
        sort(ans.begin(),ans.end());
        return ans;
        
    }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    getchar();
    
    Solution x = Solution();
    
    while(t--)
    {
        string s;
        getline(cin,s);
        Node* head = buildTree(s);
        
        int target, k;
        cin>> target >> k;
        getchar();
        
        vector <int> res = x.KDistanceNodes(head, target, k);
        
        for( int i=0; i<res.size(); i++ )
            cout<< res[i] << " ";
        cout<<endl;
    }
    return 0;
}

// } Driver Code Ends