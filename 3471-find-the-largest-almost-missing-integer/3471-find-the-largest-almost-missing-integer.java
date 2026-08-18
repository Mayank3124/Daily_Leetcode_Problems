class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = nums[0];
        int ans = 0;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            max = Math.max(i,max);
        }
        if(k==nums.length){
            ans = max;
        }
        else if(k > 1){
        int first = -1;
        int second = -1;

        if(map.get(nums[0])==1) first = nums[0];
        if(map.get(nums[nums.length-1])==1) second = nums[nums.length-1];

        ans = Math.max(first,second);}
        else {
            int m = -1;
            for(int key : map.keySet()){
                if(map.get(key)==1){
                    m = Math.max(m,key);
                }
            }
            ans = m;
        }
        return ans;
    }
}