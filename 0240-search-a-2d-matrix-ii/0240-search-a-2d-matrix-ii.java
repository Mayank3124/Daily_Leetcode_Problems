class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int l = 0;
            int r = n - 1;
            if (matrix[i][l] == target || matrix[i][r] == target){
                return true;
            }else if (matrix[i][l] < target && matrix[i][r] > target) {
                while (l < r - 1) {
                    int mid = (r + l) / 2;
                    if (matrix[i][mid] < target) {
                        l = mid;
                    } else if (matrix[i][mid] > target) {
                        r = mid;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}