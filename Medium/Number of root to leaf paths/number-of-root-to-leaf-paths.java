//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

class Roof_To_Leaf_Paths_Having_Equal_Length
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
    static void printInorder(Node root){
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
	public static void main(String args[]) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
		while(t>0)
		{
		    String s = br.readLine();
	    	Node root = buildTree(s);
			GfG g = new GfG();
			g.countPaths(root);
			System.out.println();
		    t--;
		}
	}
}
// } Driver Code Ends


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */


class GfG
{
    void countPaths(Node root)
    {
    ArrayList<ArrayList<Node>> list = new ArrayList<>();
    ArrayList<Node> lt = new ArrayList<>();
    
    helper(root,list,lt);
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<list.size(); i++)
    {
        int num = list.get(i).size();
        if(map.containsKey(num))
        {
            int val = map.get(num)+1;
            map.put(num,val);
        }
        else
        {
            map.put(num,1);  
        }
    }
    
    for(Map.Entry en: map.entrySet())
    {
        System.out.print((int) en.getKey()+" "+(int) en.getValue()+" $");
    }
    }
    void helper(Node curnode,ArrayList<ArrayList<Node>> list, ArrayList<Node>lt)
    {
        if(curnode == null) return;
        
        lt.add(curnode);
        if(curnode.left == null && curnode.right == null)
        {
            list.add(new ArrayList<>(lt));
            if(lt.size() > 0)
            {
                lt.remove(lt.size()-1);
            }
            return;
        }
        
        helper(curnode.left,list,lt);
        helper(curnode.right,list,lt);
        lt.remove(lt.size()-1);
    }
}
