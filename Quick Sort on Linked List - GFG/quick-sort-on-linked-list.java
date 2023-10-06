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

class SortLL
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
            
            for(int i = 1; i< n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);
            
            printList(node);
            System.out.println();
        }
    }
    public static void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    public static void addToTheLast(Node node) 
{
  if (head == null) 
  {
    head = node;
  } else 
  {
   Node temp = head;
   while (temp.next != null)
          temp = temp.next;
         temp.next = node;
  }
}
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
    
}*/
// you have to complete this function
class GfG
{
public static Node getTail(Node head) {
        
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        return temp;
    }
    public static Node[] partition(Node head) {
        Node pivot = head;
        Node temp = head.next;
        pivot.next = null;
        
        
        Node leftHead = null, leftTail = null;
        Node rightHead = null, rightTail = null;
        
        // partition
        while(temp != null) {
            Node shift = temp.next;
            temp.next = null;
            
            if(pivot.data >= temp.data) {
                if(leftHead == null) {
                    leftHead = leftTail = temp;
                } else {
                    leftTail.next = temp;
                    leftTail = leftTail.next;
                }
            } else {
                if(rightHead == null) {
                    rightHead = rightTail = temp;
                } else {
                    rightTail.next = temp;
                    rightTail = rightTail.next;
                }
            }
            
            temp = shift;
        }

        Node[] part = {leftHead, pivot, rightHead};
        return part;
    }
    
    public static Node quickSort(Node head)
    {
        if(head == null || head.next == null) return head;
        
        Node[] part = partition(head);
        Node leftHead = part[0];
        Node pivot = part[1];
        Node rightHead = part[2];
        
        // recursive call of both side
        Node lhead = quickSort(leftHead);
        Node rhead = quickSort(rightHead);
        
        pivot.next = rhead;
        if(lhead == null) return pivot;
        Node tail = getTail(lhead);
        
        tail.next = pivot;
        return lhead;
    }
    
    
}