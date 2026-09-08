class Solution {
    public void back(List result, List list, int target, int sum, int[] nums, int idx){
        if(sum == target){
            result.add(new ArrayList<>(list));
            return;
        }if(sum > target) return;
        for(int i = idx; i < nums.length;i++){
            list.add(nums[i]);
            back(result,list,target,sum+nums[i],nums,i+1);
            list.remove(list.size()-1);
            while(i < nums.length-1 && nums[i]==nums[i+1])i++;
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        back(result,list,target,0,candidates,0);
        return result;
    }
}