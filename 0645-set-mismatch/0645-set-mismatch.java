class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dup = 0;
        int miss = 0;
        for(int i : nums){
            if(set.contains(i)) dup = i;
            set.add(i);
        }
        for(int i = 1; i <=set.size()+1; i++){
            if(!set.contains(i)){
                miss = i;
            }
        }
        return new int[]{dup,miss};
    }
}