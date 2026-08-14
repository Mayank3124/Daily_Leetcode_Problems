class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int[] pref = new int[nums.size()];
        pref[0] = nums.get(0);
        for(int i = 1; i < pref.length; i++){
            pref[i] = pref[i-1] + nums.get(i);
        }
        int min = Integer.MAX_VALUE;
        for(int i = l; i < r+1; i++){
            if(pref[i-1] > 0) min = Math.min(min,pref[i-1]);
            for(int j = i;j < pref.length; j++ ){
                if(pref[j]-pref[j-i] > 0){
                    min = Math.min(min,pref[j]-pref[j-i]);
                }
                
            }
        }

        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
}