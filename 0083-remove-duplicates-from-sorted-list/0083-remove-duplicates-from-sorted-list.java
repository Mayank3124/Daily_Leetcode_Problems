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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode node = head;
        ListNode dist = head.next;
        while(dist != null){
            if(node.val != dist.val){
                node.next = dist;
                node = node.next;
            } 
            dist = dist.next;
            
        }
        node.next = null;
        return head;
    }
}