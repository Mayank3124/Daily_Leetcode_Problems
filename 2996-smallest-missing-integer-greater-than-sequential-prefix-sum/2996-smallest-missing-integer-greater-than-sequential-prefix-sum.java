class Solution {
    public int missingInteger(int[] nums) {
        int val = nums[0];
        int l = 1;
        while(l < nums.length && nums[l] == nums[l-1]+1){
            val += nums[l]; 
            l++;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = l-1; i < nums.length; i++){
            set.add(nums[i]);
        }

        while(set.contains(val)){
            val++;
        }
        return val;
    }
}