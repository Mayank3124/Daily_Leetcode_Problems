class Solution {
    int dp[];
    public int helper(int[] nums, int idx){
        int max = 0;
        for(int i = idx + 1; i < nums.length; i++){
            if(nums[idx] < nums[i]){
                max = Math.max(max,dp[i]);
            }
        }
        return 1 + max;
    }
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length];
        int max = 0;
        for(int i = nums.length -1; i >= 0; i--){
            dp[i] = helper(nums,i);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}