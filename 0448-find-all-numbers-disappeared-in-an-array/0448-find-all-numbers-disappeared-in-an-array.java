class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int count[] = new int [nums.length+1];
        for(int num : nums){
            count[num]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(count[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}