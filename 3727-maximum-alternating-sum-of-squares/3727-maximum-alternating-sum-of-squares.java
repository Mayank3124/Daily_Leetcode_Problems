class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long sum = 0;
        int i = nums.length-1;
        while(i >= nums.length/2){
            sum += nums[i];
            i--;
        }
        while(i >= 0){
            sum -= nums[i];
            i--;
        }
        return sum;

    }
}