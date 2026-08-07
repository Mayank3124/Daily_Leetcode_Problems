class Solution {
    public int pivotIndex(int[] nums) {
        int[] pref =new int[nums.length + 1];
        pref[0] = 0;
        for(int i = 1; i < pref.length; i++){
            pref[i] = pref[i-1] + nums[i-1];
        }
        for(int i = 1; i < pref.length; i++){
            if(pref[i-1]==pref[pref.length-1]-pref[i]) return i-1;
        }
        return -1;
    }
}