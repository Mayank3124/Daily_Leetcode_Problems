class Solution {
    public int missingNumber(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : nums){
            set.add(i);
        }
        int i = 0;
        for(int k : set){
            if(i!=k) return i;
            i++;
        }
        return i;
    }
}