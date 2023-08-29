//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node left, right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

class MaxSum
{
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution ob = new Solution();
			    int ans = ob.getMaxSum(root);
			    System.out.println(ans);
                t--;
	        }
    }
}




// } Driver Code Ends


//User function Template for Java
/*class Node
{
    int data;
    Node left, right;
    
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}*/

class Solution {
   
    static class pair {
        int first;  // Includes root value sum
        int second; // Excludes root value sum
        
        pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
   
    static pair solve(Node root) {
        if (root == null) {
            // If the root is null, return a pair with both sums as 0
            return new pair(0, 0);
        }
        
        // Recursively solve for the left and right subtrees
        pair leftans = solve(root.left);
        pair rightans = solve(root.right);
        
        // Calculate the sums for the current node, considering inclusion and exclusion
        pair ans = new pair(0, 0);
        
        ans.first = root.data + leftans.second + rightans.second;  // Include root value
        ans.second = Math.max(leftans.first, leftans.second) + Math.max(rightans.first, rightans.second);  // Exclude root value
        
        return ans;
    }
   
    static int getMaxSum(Node root) {
        pair ans = solve(root);
        // Return the maximum of the two sums (including root and excluding root)
        return Math.max(ans.first, ans.second);
    }
}