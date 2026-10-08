class Solution {
    Integer dp[];
    public int minCost(int[] cost, int idx){
        if(idx >= cost.length-2) return 0;
        int min = Integer.MAX_VALUE;
        for(int i = idx + 1; i < idx + 3; i++ ){
            if(dp[i]==null){
                dp[i] = cost[i] + minCost(cost,i);
            }
            min = Math.min(min,dp[i]);
        }
        return min;
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new Integer[cost.length];
        return minCost(cost,-1);
    }
}