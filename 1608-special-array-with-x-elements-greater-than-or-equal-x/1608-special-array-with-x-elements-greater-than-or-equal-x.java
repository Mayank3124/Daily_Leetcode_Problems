class Solution {
    public int GreaterOrEqual(int target, int[] nums){
        int val = 0;
        for(int i : nums){
            if(i>=target) val++;
        }
        return val;
    }
    public int specialArray(int[] nums) {
        int l = 0;
        int r = nums.length;
        int ans = -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            int val = GreaterOrEqual(mid, nums);
            if( val > mid ){
                l = mid + 1;
            } else if(val < mid){
                r = mid - 1;
            } else {
                ans = mid;
                break;
            }
        }
        return ans;
    }
}