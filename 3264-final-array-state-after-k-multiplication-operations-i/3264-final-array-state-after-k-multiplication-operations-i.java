class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) ->{
                if(a[0]!=b[0]){
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            }
        );
        for(int i = 0; i < nums.length; i++){
            pq.offer(new int[]{nums[i],i});
        }
        for(int i = 0; i < k; i++){
            int x[] = pq.poll();
            pq.offer(new int[]{x[0]*multiplier,x[1]});
        }

        int arr[] = new int[nums.length];
        
        while(!pq.isEmpty()){
            int x[] = pq.poll();
            int idx = x[1];
            arr[idx] = x[0];
        }
        return arr;
    }
}