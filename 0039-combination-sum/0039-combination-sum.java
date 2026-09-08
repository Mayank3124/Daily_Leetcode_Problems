class Solution {
    public void backtrack(List List, List list, int target, int sum, int[] nums, int start){
        if(sum==target) {
            List.add(new ArrayList<>(list));
            return ;
        }
        if(sum > target) return;

        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            backtrack(List,list,target,sum + nums[i],nums,i);
            list.remove(list.size()-1);
        }

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> List = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtrack(List,list,target,0,candidates,0);
        return List;
        
    }
}