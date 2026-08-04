class Solution {
    public boolean isGreaterSum(int k, int[] nums, int target){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(i >= k){
                sum -= nums[i-k];
            }
            if(sum >= target){
                return true;
            }

        }
        return false;
    }
    public int minSubArrayLen(int target, int[] nums) {
        int l = 1;
        int r = nums.length;
        int min = 0;
        while(l < r){
            int mid = l + (r - l)/2;
            if(isGreaterSum(mid,nums,target)){
                min = mid;
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if(min==0&&isGreaterSum(nums.length,nums,target)) return nums.length;
        return min;
   }
}