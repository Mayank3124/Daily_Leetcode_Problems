/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node slow = head;
        Node fast = head;

        while(slow != null){
            if(slow.child != null){
                Node next = slow.next;
                
                Node child = flatten(slow.child);
                
                
                slow.next = child;
                child.prev = slow;
                slow.child = null;
                
                
                while(slow.next != null) slow = slow.next;
                slow.next = next;
                if(next != null) {
                    next.prev = slow;
                }

            }
            slow = slow.next;
        }
        return head;
    }
}