class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dup = 0;
        int sum = 0;
        for(int i : nums){
            sum += i;
            if(set.contains(i)) dup = i;
            set.add(i);
        }
        int n = nums.length;
        int miss = (n*(n+1)/2)+dup-sum;
        
        return new int[]{dup,miss};
    }
}