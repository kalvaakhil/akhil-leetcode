//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}


class ConstructTree
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int pre[] = new int[n];
            int preM[] = new int[n];
            
            for(int i = 0; i < n; i++)
              pre[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preM[i] = sc.nextInt();
            
            Solution gfg = new Solution();  
           
            
            inorder(gfg.constructBTree(pre, preM, n));
            System.out.println();
            
        }
    }
    
    public static void inorder(Node root)
    {
        if(root == null)
         return;
         
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
  public Node constructBTree(int pre[], int preM[], int size)
    {
        // your code here
        Node root = recurs(pre , preM , 0 , pre.length-1 , 0 , preM.length-1);
        return root ;
    }
    public Node recurs(int pre[], int preM[], int prs , int pree , int pos , int poe){
        if(pree < prs)return null ;
        
        Node node = new Node(pre[prs++]) ;
        int i = pos + 1 ;
        int count = 0 ;
        while(i < poe){
            if(preM[i] == pre[prs])break ;
            i++ ;
            count++ ;
        }
        // left part in right and right part in left
        node.left = recurs(pre , preM , prs , prs+count-1 , i , poe);
        
        node.right = recurs(pre , preM , prs+count , pree , pos+1 , i-1);
        return node ;
    }
    
}