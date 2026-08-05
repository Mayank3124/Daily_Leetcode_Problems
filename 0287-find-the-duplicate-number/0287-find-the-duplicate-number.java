class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length];

        for(int i : nums){
            if(freq[i]==1){
                return i;
            }
            freq[i]++;
        }
        return 1;
    }
}