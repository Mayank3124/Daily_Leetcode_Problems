class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        while(i<m){
            if(matrix[i][n-1]>target) break;
            else if(matrix[i][n-1]==target) return true;
            i++;
        }
        if(i==m) return false;
        int l = 0;
        int r = n-1;
        if(matrix[i][l]==target) return true;
        while(l<r-1){
            int mid =( r + l)/2;
            if(matrix[i][mid]<target){
                l = mid;
            }
            else if(matrix[i][mid]>target){
                r = mid;
            }
            else{
                return true;
            }
        }
        return false;
    }
}