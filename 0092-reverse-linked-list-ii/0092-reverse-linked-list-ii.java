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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right) return head;
        ListNode Dummy = new ListNode(-1);
        ListNode Left = Dummy;
        ListNode fast = head;
        for(int i = 1; i < left; i++){
            Left.next = fast;
            Left = Left.next;
            fast = fast.next;
        }
        ListNode Right = fast;
        
        for(int i = left; i <= right; i++ ){
            ListNode curr = Left.next;
            Left.next = fast;
            fast = fast.next;
            Left.next.next = curr;
        }
        Right.next = fast;
        return Dummy.next;
    }
}