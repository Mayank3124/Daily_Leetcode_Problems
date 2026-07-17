class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> nums[b] - nums[a] );
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            pq.offer(i);

        }
        int[] arr = new int[k];
        for(int i = 1; i <= k; i++){
            pq2.offer(pq.poll());
        }
        for(int i = 0; i < k; i++){
            arr[i] = nums[pq2.poll()];
        }
        return arr;
    }
}