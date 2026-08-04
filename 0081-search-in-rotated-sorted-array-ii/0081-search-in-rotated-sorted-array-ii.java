class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;

        if(nums[0]>target){
            for(int i = n-1; i > 0; i--){
                if(nums[i]==target){
                    return true;
                }else if(nums[i]<target){
                    break;
                }
            }
        }
        else {
            for(int i = 0; i < n; i++){
                if(nums[i]==target){
                    return true;
                }else if(nums[i]>target){
                    break;
                }
            
            }
        
        }
        return false;
    }
}