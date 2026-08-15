class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int l = 0;
        int Length = 0;
        int min = Integer.MAX_VALUE; 
        for(int i = 0; i < nums.length; i++ ){
            sum += nums[i];
            Length ++;

            while(sum >= target){
                min = Math.min(Length,min);
                sum -= nums[l];
                l++;
                Length--;
            } 
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}