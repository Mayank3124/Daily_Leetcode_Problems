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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode ending = head;
        ListNode fast = head;
        ListNode begining = null;
        while(k-- > 0){
            begining = fast;
            fast = fast.next;
        } 

        while(fast!=null){
            fast = fast.next;
            ending = ending.next;
        }

        int temp = ending.val;
        ending.val = begining.val;
        begining.val = temp;

        return head;
    }
}