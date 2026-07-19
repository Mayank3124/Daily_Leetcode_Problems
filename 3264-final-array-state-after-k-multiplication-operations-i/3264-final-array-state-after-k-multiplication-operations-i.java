class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) ->{
                if(nums[a]!=nums[b]){
                    return nums[a] - nums[b];
                }
                return a - b;
            }
        );
        for(int i = 0; i < nums.length; i++){
            pq.offer(i);
        }
        for(int i = 0; i < k; i++){
            int idx = pq.poll();
            nums[idx] *= multiplier;  
            pq.offer(idx);
        }

        // int arr[] = new int[nums.length];
        
        // while(!pq.isEmpty()){
        //     int x[] = pq.poll();
        //     int idx = x[1];
        //     arr[idx] = x[0];
        // }
        return nums;
    }
}