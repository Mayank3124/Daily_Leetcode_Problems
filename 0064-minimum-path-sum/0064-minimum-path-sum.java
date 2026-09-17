class Solution {
    Integer[][] dp;
    public int path(int[][] grid, int i , int j){
        int m = grid.length;
        int n = grid[0].length;

        if( i == m || j == n) return Integer.MAX_VALUE;
        if( i == m-1 && j == n-1) return grid[i][j];
        if(dp[i][j] == null){
            dp[i][j] = Math.min(path(grid,i+1,j),path(grid,i,j+1)) + grid[i][j];
        }
        return dp[i][j] ;
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        dp = new Integer[m][n];

        return path(grid, 0,0);
        
    }
}