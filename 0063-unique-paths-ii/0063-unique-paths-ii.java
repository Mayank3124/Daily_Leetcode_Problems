class Solution {
    public int path(int i, int j, int[][] grid, int[][] dp){
        int m = grid.length;
        int n = grid[0].length;

        if(i == m || j == n || grid[i][j] == 1) return 0;
        if(i == m-1 && j == n - 1) return 1;
        if(dp[i][j]==0){
            dp[i][j] = path(i+1,j,grid,dp) + path(i,j+1,grid,dp);
        }
        return dp[i][j];
        
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int [m][n];
        return path(0,0,grid,dp);
    }
}