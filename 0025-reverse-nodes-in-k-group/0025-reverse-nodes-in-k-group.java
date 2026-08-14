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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode node = head;
        int size = 0;
        while(node != null){
            size++;
            node = node.next;
        }
        node = head;
        
        int l = size/k;
        for(int i = 0; i < l; i++){
            ListNode start = node;
            for(int j = 0; j < k; j++){
                ListNode curr = temp.next;
                temp.next = node;
                node = node.next;
                temp.next.next = curr;
            }
            temp = start;
        }
        temp.next = node;
        return dummy.next;

        
    }
}