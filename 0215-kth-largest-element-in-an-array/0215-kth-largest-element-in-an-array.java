class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Q = new PriorityQueue<>();

        for(int i : nums){
            Q.offer(i);
            if(Q.size()>k) Q.poll();
        }

        return Q.peek();
    }
}