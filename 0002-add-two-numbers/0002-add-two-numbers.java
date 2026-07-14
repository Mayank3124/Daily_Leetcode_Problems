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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;

        ListNode Head = new ListNode(-1);
        ListNode temp = Head;

        int carry = 0;
        int value = 0;

        while(head1!=null && head2!=null){
            value = (head1.val + head2.val + carry);
            temp.next = new ListNode(value%10);
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
            carry = value / 10;
        }

        System.out.println(carry);
        if(head1==null){
            while(head2!=null){
                value = (head2.val + carry);
                temp.next = new ListNode(value%10);
                temp = temp.next;
                head2 = head2.next;
                carry = value/10;
            }
        }else if(head2==null){
            while(head1!=null){
                value = (head1.val + carry);
                temp.next = new ListNode(value%10);
                temp = temp.next;
                head1 = head1.next;
                carry = value/10;
            }
        }
        if(carry==1) temp.next = new ListNode(carry);
        return Head.next;
    }
}