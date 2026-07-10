class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            
            sum += nums[i];
            if(i>=k) {
                sum = sum - nums[l];
                l++;
                
            }
            if(i>=k-1)max = Math.max(max, sum);
        } 
        if(nums.length<=k ) return (double) sum/k;
        return (double) max/k;
    }
}