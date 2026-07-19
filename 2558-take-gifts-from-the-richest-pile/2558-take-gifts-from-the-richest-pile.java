class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for(int i : gifts){
            pq.offer(i);
            sum += i;
        }
        
        for(int i = 0; i < k; i++){
            int num = pq.poll();
            int remaining = (int)Math.pow(num,0.5);
            pq.offer(remaining);
            sum = sum - num + remaining;
        }
        
        
        return sum;
    }
}