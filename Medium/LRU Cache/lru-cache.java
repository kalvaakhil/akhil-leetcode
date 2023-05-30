//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

  public class LRUDesign {

    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr = 0;

            for (int i = 0; (i < queries) && (itr < len); i++) {
                String queryType = str[itr++];
                if (queryType.equals("SET")) {
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key, value);
                }
                if (queryType.equals("GET")) {
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// design the class in the most optimal way

class LRUCache
{
    static HashMap<Integer,Node> hm;
    static Node head;
    static Node tail;
    static int cap;
    LRUCache(int cap)
    {
        hm=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        this.cap=cap;
        head.next=tail;
        tail.prev=head;
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        if(hm.containsKey(key)){
            Node newNode=hm.get(key);
            delete(newNode);
            insert(newNode);
            return newNode.val;
        }else{
            return -1;
        }
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        if(hm.containsKey(key)){
            Node newNode=hm.get(key);
            newNode.val=value;
            hm.put(key,newNode);
            delete(newNode);
            insert(newNode);
        }else if(hm.size()<cap){
            Node newNode=new Node(key,value);
            hm.put(key,newNode);
            insert(newNode);
        }else{
            Node newNode=new Node(key,value);
            Node toDelete=tail.prev;
            hm.remove(toDelete.key);
            delete(toDelete);
            hm.put(key,newNode);
            insert(newNode);
        }
    }
    
    public static void delete(Node node){
        Node prev=node.prev;
        Node next=node.next;
        
        prev.next=next;
        next.prev=prev;
    }
    
    public static void insert(Node node){
        Node headNext=head.next;
        head.next=node;
        node.prev=head;
        node.next=headNext;
        headNext.prev=node;
    }
    //Create A Doubly LL
    static class Node{
        int key;
        int val;
        Node next;
        Node prev;
        public Node(int key,int val){
            this.key=key;
            this.val=val;
            next=prev=null;
        }
    }
}
