class Solution {
    public int minStartValue(int[] nums) {
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            pref[i] = nums[i] + pref[i-1];
        }

        int min = 0;
        for(int i : pref){
            min = Math.min(min,i);
        }
        return Math.abs(min) + 1;

    }
}