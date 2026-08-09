class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] pref = new int[nums.length+2];
        pref[0] = 0;
        
        for(int i = 1; i < pref.length-1; i++){
            pref[i] = pref[i-1] + nums[i-1];
        }
        pref[pref.length - 1] = pref[pref.length-2];
        for(int i = 1; i < pref.length-1; i++){
            if(pref[pref.length-1]-pref[i] == pref[i-1]){
                return i-1;
            }
        }
        return -1;
    }
}