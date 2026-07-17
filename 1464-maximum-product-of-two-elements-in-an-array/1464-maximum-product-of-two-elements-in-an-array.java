class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : nums){
            pq.offer(i);
            if(pq.size() > 2) pq.poll();
        }

        return (pq.poll()-1)*(pq.poll()-1);
    }
}