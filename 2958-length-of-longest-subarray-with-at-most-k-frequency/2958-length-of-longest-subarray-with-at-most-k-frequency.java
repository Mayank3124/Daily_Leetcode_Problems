class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int max = 0;
        int l = 0;
        int length = 0;

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i) > k){
                
                map.put(i, map.get(i)-1);
                while(nums[l]!=i){
                    map.put(nums[l], map.get(nums[l]) - 1);
                    l++;
                    length--;
                }
                l++;
                
                
            } else {
                length ++;
                max = Math.max(length, max);
            }
        }
        return max;

    }
}