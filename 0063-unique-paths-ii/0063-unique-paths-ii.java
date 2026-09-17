class Solution {
    int[][] dp;
    public int path(int i, int j, int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        if(i == m || j == n || grid[i][j] == 1) return 0;
        if(i == m-1 && j == n - 1) return 1;
        if(dp[i][j]==-1){
            dp[i][j] = path(i+1,j,grid) + path(i,j+1,grid);
        }
        return dp[i][j];
        
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int [m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }
        return path(0,0,grid);
    }
}