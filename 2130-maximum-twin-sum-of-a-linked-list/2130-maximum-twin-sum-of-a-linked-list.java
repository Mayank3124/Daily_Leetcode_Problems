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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode node = slow.next;
        ListNode temp = node.next;
        slow.next = null;
        while(temp != null){
            ListNode curr = node;
            node = temp;
            temp = temp.next;
            node.next = curr; 
        }

        int max = 0;

        while(head != null){
            max = Math.max(head.val+node.val,max);
            head = head.next;
            node = node.next;
        }

        return max;

        
    }
}