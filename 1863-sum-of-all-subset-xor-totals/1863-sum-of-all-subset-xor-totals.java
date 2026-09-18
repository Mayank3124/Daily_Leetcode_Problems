class Solution {
    int xor = 0;
    public void helper(int x, int[] nums, int idx){
        xor += x;
        for(int i = idx; i < nums.length; i++){
            helper(x^nums[i], nums, i + 1);
        }
    }
    public int subsetXORSum(int[] nums) {
        xor = 0;
        helper(0, nums, 0);
        return xor;
    }
}