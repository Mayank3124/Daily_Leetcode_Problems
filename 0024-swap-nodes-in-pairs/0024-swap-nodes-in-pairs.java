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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null ){
            slow.next = slow.next.next;
            temp.next = fast;
            temp = temp.next;
            temp.next = slow;
            temp = temp.next;

            slow = slow.next;
            if(slow==null ){
                break;
            } 
            fast = slow.next;
        }
        return dummy.next;
    }
}