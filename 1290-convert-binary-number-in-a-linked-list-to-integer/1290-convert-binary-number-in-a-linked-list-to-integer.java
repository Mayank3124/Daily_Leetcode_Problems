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
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(node!=null){
            list.add(0,node.val);
            node = node.next; 
        }
        int num = 0;
        for(int i = 0; i < list.size(); i++ ){
            if(list.get(i)==1){
                num += Math.pow(2,i);
            }
        }
        return num;

    }
}