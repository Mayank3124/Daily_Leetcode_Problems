class Solution {
    public void backtrack(List result, List list, int[] nums, boolean[] check){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!check[i]){
                check[i] = true;
                list.add(nums[i]);
                backtrack(result,list,nums,check);
                check[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,new boolean[nums.length]);
        return result;
    }
}