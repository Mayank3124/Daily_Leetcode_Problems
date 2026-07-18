class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> nums[b] - nums[a]
        );
        for(int i = 0; i < k; i++){
            pq.offer(i);
        }
        int n = nums.length;
        int[] arr = new int[n + 1 - k];
        
        for(int i = k; i < n; i++){
            arr[i-k] =nums[pq.peek()]; 
            pq.offer(i);
            while(pq.peek()<=i-k){
                pq.poll();
            }
            
        }
        arr[n-k] = nums[pq.peek()];
        
        return arr;


    }
}