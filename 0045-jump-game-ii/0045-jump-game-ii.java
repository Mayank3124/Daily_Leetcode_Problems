class Solution {
    public int jump(int[] nums) {
        int size = 0;
        int ans = 0;
        for(int i = 0; i <= size; i = i){
            int curr = size;
            if(size >= nums.length-1) return ans;
            while(i <= curr){
                size = Math.max(size, i+nums[i]);
                
                i++;
            }
            ans++;
        }
        return -1;
    }
}