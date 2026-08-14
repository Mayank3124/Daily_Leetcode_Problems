class Solution {
    public boolean isGreaterSum(int k, int[] nums, int target){
        if(nums[k-1] >= target ) return true;
        for(int i = k; i < nums.length; i++){
            if(nums[i]-nums[i-k] >= target) return true;
        }
        return false;
    }
    public int minSubArrayLen(int target, int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        int l = 1;
        int r = nums.length;
        int min = 0;

        while(l <= r){
            int mid = l + (r - l)/2;
            if(isGreaterSum(mid,nums,target)){
                min = mid;
                r = mid-1;
            } else {
                l = mid + 1;
            }
        }
        
        return min;
   }
}