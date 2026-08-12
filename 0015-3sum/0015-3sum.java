class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> List = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                if(nums[l]+nums[i]>0 || nums[r]<0) break;
                int sum =nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                }else if(sum < 0){
                    l++;
                } else {
                    
                    List.add(Arrays.asList(nums[i], nums[l],nums[r]));
                    
                    l++;
                    r--;
                    while(nums[l]==nums[l-1] && l < r) l++;
                    while(nums[r]==nums[r+1] && l < r) r--;
                    
                }
            }
            

        }
        return List;

    }
}