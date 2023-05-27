//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution {
    public static Node modifyTheList(Node head) {
        Node node = head;
        ArrayList<Integer> res = new ArrayList<>();
        while (node != null) {
            res.add(node.data);
            node = node.next;
        }
        int n = res.size();
        ArrayList<Integer> res2 = new ArrayList<>(res.subList(0, n / 2));
        for (int i = 0; i < n / 2; i++) {
            res.set(i, res.get(n - i - 1) - res.get(i));
        }
        for (int i = 0; i < res2.size(); i++) {
            res.set(n - i - 1, res2.get(i));
        }
        
        Node node2 = head;
        int i = 0;
        while (node2 != null) {
            node2.data = res.get(i);
            i++;
            node2 = node2.next;
        }
        
        return head;
    }
}

