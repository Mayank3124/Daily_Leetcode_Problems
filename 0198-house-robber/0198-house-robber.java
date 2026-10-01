class Solution {
    Integer dp[];
    public int backTrack(int idx, int[] nums){
        
        int max = 0;
        for(int i = idx + 2; i < nums.length; i++){
            if(dp[i]==null){
                dp[i] = backTrack(i,nums);
            }
            max = Math.max(max,dp[i]);
        }
        return nums[idx] + max;
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        dp = new Integer[nums.length];
        dp[0] = backTrack(0,nums);
        dp[1] = backTrack(1,nums);
        int max = 0;
        return Math.max(dp[0],dp[1]);
    }
}