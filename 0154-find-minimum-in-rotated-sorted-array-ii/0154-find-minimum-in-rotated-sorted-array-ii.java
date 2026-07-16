class Solution {
    public int findMin(int[] nums) {
        int n = nums.length -1;
        if(nums[0]<nums[n]) return nums[0];

        for(int i = 0; i < n; i++ ){
            if(nums[n-i] < nums[n-i-1]){
                return nums[n-i];
            }
            if(nums[i] > nums[i+1]){
                return nums[i+1];
            }
        }

        return nums[0];
    }
}