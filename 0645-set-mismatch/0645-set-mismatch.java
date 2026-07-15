class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        int totalSum = 0;
        for(int i : nums){
            totalSum += i;
            
            set.add(i);
        }
        int sum = 0;
        for(int i : set){
            sum += i;
        }
        int dup = totalSum-sum;
        int n = nums.length;
        int miss = (n*(n+1)/2)-sum;
        
        return new int[]{dup,miss};
    }
}