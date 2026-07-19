class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] arr : matrix){
            for(int num : arr){
                pq.offer(num);
                if(pq.size()>k) pq.poll();
            }
        }
        return pq.peek();
    }
}