class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int zero = 0;
        int n = nums.length;
        for(int i : nums){
            if(i < 0) neg++;
            else if(i == 0) zero++;
        }
        return Math.max(neg, n - zero - neg);
    }
}