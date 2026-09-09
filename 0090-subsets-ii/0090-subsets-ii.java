class Solution {
    public void back(List result, List list, int[] nums, int idx){
        result.add(new ArrayList<>(list));

        for(int i = idx; i < nums.length; i++){
            list.add(nums[i]);
            back(result,list,nums,i+1);
            list.remove(list.size()-1);
            while(i < nums.length-1 && nums[i]==nums[i+1]) i++;
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        back(result, new ArrayList<>(), nums, 0);
        return result;
    }
}