class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Q = new PriorityQueue<>();

        for(int i : nums){
            Q.add(i);
            if(Q.size()>k) Q.remove();
        }

        return Q.peek();
    }
}