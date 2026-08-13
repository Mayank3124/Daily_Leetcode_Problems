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
    public ListNode rotateRight(ListNode head, int k) {
        int size = 1;
        ListNode node = head;
        if(head == null) return head;

        while(node.next != null){
            node = node.next;
            size++;
        }
        k = k % size;
        if(k == 0) return head;
        
        ListNode fast = head;
        while(k-- > 0){
            fast = fast.next;
        }
        ListNode slow = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        node = slow.next;
        slow.next = null;
        fast.next = head;
        return node;
    }
}