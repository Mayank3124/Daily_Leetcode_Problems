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
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(head!=null){
            map.put(head.val, map.getOrDefault(head.val,0)+1);
            head = head.next;
        }
        ListNode ans = new ListNode(1);
        ListNode temp = ans;
        for(int k : map.keySet()){
            if(map.get(k)==1){
                temp.next = new ListNode(k);
                temp = temp.next;
            }
        }
        temp.next = null;
        return ans.next; 
    }
}