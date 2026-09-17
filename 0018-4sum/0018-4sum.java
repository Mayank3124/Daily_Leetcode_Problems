class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> List = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n - 3; i++ ){
            
            for(int j = i+1; j < n-2; j++){
                
                int l = j + 1;
                int r = n - 1;
                while(l < r){
                    
                    long sum =(long) nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum < target) l++;
                    else if(sum > target) r--;
                    else {
                        List.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                        while(l < r && nums[l]==nums[l-1]) l++;
                        while(l < r && nums[r]==nums[r+1]) r--;
                    }
                }
                while(j < n - 2 && nums[j]==nums[j + 1]) j++;
            }
            while(i < n - 3 && nums[i]==nums[i+1]) i++;
        }
        return List;
    }
}