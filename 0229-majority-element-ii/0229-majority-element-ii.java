class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int k : map.keySet()){
            if(map.get(k)>(nums.length/3)){
                list.add(k);
            }
        }
        return list;
    }
}