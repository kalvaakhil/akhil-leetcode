/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) { 
        ListNode temp=head;
        ArrayList<Integer> l=new ArrayList<>();
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(l);
        int val=0;
        temp=head;
        while(temp!=null){
            temp.val=l.get(val);
            val++;
            temp=temp.next;
        }
        return head;  
    }
}