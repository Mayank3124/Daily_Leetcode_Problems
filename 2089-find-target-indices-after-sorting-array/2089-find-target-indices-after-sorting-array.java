class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int l = 0;
        int r = nums.length;
        int mid = l;
        while(l < r){
            mid = l + (r - l)/2;
            if(nums[mid]>target){
                r = mid;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else break;
        }
        l = mid;
        
        while(l >= 0 && nums[l]==target){
            list.add(0,l);
            l--;
        }
        r = mid + 1;
        while(r < nums.length && nums[r]==target){
            list.add(r);
            r++;
        }
        return list;
    }
}