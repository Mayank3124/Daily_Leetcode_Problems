class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long sum = 0;
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            sum += (nums[j]-nums[i]);
            i++;
            j--;
        }
        if(i == j){
            return sum + nums[i];
        }
        return sum;

    }
}