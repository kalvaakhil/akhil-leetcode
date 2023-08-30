//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rerrange
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            
            for(int i = 1; i < n; i++)
            {
                int data = sc.nextInt();
                addToTheLast(new Node(data));
            }
            GfG gfg = new GfG();
            Node node = gfg.rearrange(head);
            printList(node);
            System.out.println();
        }
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
              temp = temp.next;
              temp.next = node;
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}


// } Driver Code Ends


/*
The structure of linked list is the following

class Node
{
int data;
Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG 
{
    public static Node rearrange(Node head)
    {
        ArrayList<Node> arr = new ArrayList<>();
        ArrayList<Node> a = new ArrayList<>();
        
        Node temp = head;
        while(temp!=null){
            arr.add(temp);
            temp = temp.next;
        }
        
        int start = 0;
        int end = arr.size()-1;
        
        while(start<=end){
            a.add(arr.get(start));
            a.add(arr.get(end));
            start++;
            end--;
        }
        
        for(int i=0; i<a.size()-2; i++){
            a.get(i).next = a.get(i+1);
        }
        
        a.get(a.size()-1).next = null;
        
        return a.get(0);
        
    }
}


