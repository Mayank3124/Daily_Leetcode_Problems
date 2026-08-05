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
        if(head==null) return head;
        ListNode Dummy = new ListNode(-1);
        ListNode temp = Dummy;
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast!=null){
            if(slow.val != fast.val){
                temp.next = slow;
                temp = temp.next;
                slow = fast;
                fast = fast.next;
            }else {
                
                
                while(fast!=null){
                    
                    if(slow.val!=fast.val){
                        slow = fast;
                        fast = fast.next;
                        break;
                    }
                    fast = fast.next;
                }
            }
        }
        if(slow.next==null){
            temp.next = slow;
            temp = temp.next;
        }
        temp.next = null;
        
        return Dummy.next;
    }
}