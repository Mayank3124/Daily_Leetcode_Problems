class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];
        int idx = 0;
        for(int[] i : matrix){
            int cnt = 0;
            for(int j : i){
                cnt+=j;
            }
            ans[idx] = cnt;
            idx++;
        }
        return ans;
    }
}