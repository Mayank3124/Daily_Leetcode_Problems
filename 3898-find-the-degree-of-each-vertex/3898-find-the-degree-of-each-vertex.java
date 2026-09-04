class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];
        int idx = 0;
        for(int[] i : matrix){
            int cnt = 0;
            for(int j : i){
                if(j==1) cnt++;
            }
            ans[idx] = cnt;
            idx++;
        }
        return ans;
    }
}