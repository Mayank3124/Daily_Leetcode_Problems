class Solution {
    public void backtrack(List result, List list, int target, int sum, int[] nums, int start){
        if(sum==target) {
            result.add(new ArrayList<>(list));
            return ;
        }
        if(sum > target) return;

        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            backtrack(result,list,target,sum + nums[i],nums,i);
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtrack(result,list,target,0,candidates,0);
        return result;
        
    }
}