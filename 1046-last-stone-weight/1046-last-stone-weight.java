class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            pq.offer(i);
        }
        while(pq.size()!=1){
            //int s1 = pq.poll();
            //int s2 = pq.poll();
            int ns = pq.poll() - pq.poll();
            pq.offer(ns);
        }
        return pq.poll();
    }
}