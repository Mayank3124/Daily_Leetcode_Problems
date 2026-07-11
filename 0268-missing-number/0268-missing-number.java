class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            max= Math.max(max,nums[i]);
        }
        if(max < nums.length) return max + 1;
        return (max*(max+1)/2)-sum;
    }
}