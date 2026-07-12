class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int rotat[][] = new int [n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rotat[i][j] = matrix[n-1-j][i];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = rotat[i][j];
            }
        } 
        
    }
}