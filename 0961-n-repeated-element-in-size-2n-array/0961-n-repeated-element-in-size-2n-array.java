class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        for(int k : map.keySet()){
            if(map.get(k)==n/2) return k;
        }
        return 1;
    }
}