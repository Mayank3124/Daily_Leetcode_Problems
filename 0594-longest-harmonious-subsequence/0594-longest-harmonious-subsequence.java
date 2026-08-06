class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(int k : map.keySet()){
            if(map.containsKey(k+1)){
                max = Math.max(max,map.get(k)+map.get(k+1));
            }
        }
        return max;
    }
}