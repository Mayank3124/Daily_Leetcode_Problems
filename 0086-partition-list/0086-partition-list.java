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
    public ListNode partition(ListNode head, int x) {
        ListNode Dummy = new ListNode();
        Dummy.next = new ListNode(-1);

        ListNode less = Dummy;
        ListNode greater = Dummy.next;
        ListNode node = head;

        while(node!=null){
            if(node.val < x){
                ListNode curr = less.next;
                less.next = node;
                node = node.next;
                less.next.next = curr;
                less = less.next; 
            }
            else {
                greater.next = node;
                node = node.next;
                greater = greater.next;
            }

        }
        less.next = less.next.next;
        greater.next = null;


        return Dummy.next;
        
    }
}