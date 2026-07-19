class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.offer(i);
        }
        int arr[] = new int [nums.length];
        int i = 0;
        while(!pq.isEmpty()){
            int Alice = pq.poll();
            int Bob = pq.poll();
            arr[i] = Bob;
            i++;
            arr[i] = Alice;
            i++;
        }
        return arr;
    }
}