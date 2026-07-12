class Solution {
    public void sortColors(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int j = 0;
        for(int k : map.keySet() ){
            for(int i = 0; i <map.get(k); i++){
                nums[j] = k;
                j++;
            }
        }
    }
}