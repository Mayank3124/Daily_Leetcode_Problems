class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }
        int max = 0;

        for (int i : set) {
            int count = 1;

            if (!set.contains(i - count)) {
                while (set.contains(i + count)) {
                    count++;

                }
                max = Math.max(count, max);
            }

        }
        return max;
    }
}