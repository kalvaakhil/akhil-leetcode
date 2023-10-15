//{ Driver Code Starts
#include<bits/stdc++.h>
#include<stdio.h>
#include<stdlib.h>
using namespace std;

struct node
{
	int key;
	struct node *left;
	struct node *right;
	
	node(int x){
	    key = x;
	    left = NULL;
	    right = NULL;
	}
};

void inorder(struct node *root)
{
	if (root != NULL)
	{
		inorder(root->left);
		printf("%d ", root->key);
		inorder(root->right);
	}
}


node *buildTree(string str) {
    // Corner Case
    if (str.length() == 0 || str[0] == 'N')
        return NULL;

    // Creating vector of strings from input
    // string after spliting by space
    vector<string> ip;

    istringstream iss(str);
    for (string str; iss >> str;)
        ip.push_back(str);

    // Create the root of the tree
    node *root = new node(stoi(ip[0]));

    // Push the root to the queue
    queue<node *> queue;
    queue.push(root);

    // Starting from the second element
    int i = 1;
    while (!queue.empty() && i < ip.size()) {

        // Get and remove the front of the queue
        node *currNode = queue.front();
        queue.pop();

        // Get the current node's value from the string
        string currVal = ip[i];

        // If the left child is not null
        if (currVal != "N") {

            // Create the left child for the current node
            currNode->left = new node(stoi(currVal));

            // Push it to the queue
            queue.push(currNode->left);
        }

        // For the right child
        i++;
        if (i >= ip.size())
            break;
        currVal = ip[i];

        // If the right child is not null
        if (currVal != "N") {

            // Create the right child for the current node
            currNode->right = new node(stoi(currVal));

            // Push it to the queue
            queue.push(currNode->right);
        }
        i++;
    }

    return root;
}


// Function to change a key value in Binary Search Tree
struct node *changeKey(struct node *root, int oldVal, int newVal);

// Driver Program to test above functions
int main()
{
    int t;
    cin>>t;
    getchar();
    while(t--)
    {
        struct node *root = NULL;
        int n, temp, oldKey, new_key;
        string s;
        getline(cin,s);
        
        
        cin>>oldKey;
        getchar();
        cin>>new_key;
        getchar();
        root = buildTree(s);
        
        root = changeKey(root, oldKey, new_key);
        inorder(root);
        printf("\n");
    }
	return 0;
}



// } Driver Code Ends

struct node* insert_(struct node *root,int ele)
{
if(root==NULL)
{
root=(struct node *)malloc(sizeof(struct node));
root->left=NULL;
root->right=NULL;
root->key=ele;
return root;
}
else
{
if(ele<root->key)
root->left=insert_(root->left,ele);
else
root->right=insert_(root->right,ele);
return root;
}
}
int f2(struct node *root)
{
while(root->right!=NULL)
{
root=root->right;
}
return root->key;

}
int f1(struct node *root)
{
while(root->left!=NULL)
{
root=root->left;
}
return root->key;

}
struct node* delete_(struct node *root,int ele)
{

if(root==NULL)
return NULL;
if(root->key==ele)
{
if(root->left!=NULL)
{
int min=f2(root->left);
root->key=min;
root->left=delete_(root->left,min);
return root;
}
else
if(root->right!=NULL)
{
int max=f1(root->right);
root->key=max;
root->right=delete_(root->right,max);
return root;
}
else
{
return NULL;
}

}
if(ele<=root->key)
root->left=delete_(root->left,ele);
else
root->right=delete_(root->right,ele);
return root;

}

struct node *changeKey(struct node *root, int oldVal, int newVal)
{
root=insert_(root,newVal);
root=delete_(root,oldVal);
return root;
}
