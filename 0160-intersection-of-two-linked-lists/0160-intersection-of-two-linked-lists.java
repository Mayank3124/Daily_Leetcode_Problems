/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode head1 = headA;
        ListNode head2 = headB;

        while(head1 != null){
            set.add(head1);
            head1 = head1.next;
            
        }
        while(head2 != null){
            if(set.contains(head2)) return head2;
            head2 = head2.next;

        }
        return null;
    }
}