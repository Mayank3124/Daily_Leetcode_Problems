class Solution {
    public int helper(int[][] grid, int i, int j){
        int m = grid.length;
        int n = grid[0].length;

        grid[i][j] = 0;

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};

        int size = 1;

        for(int[] dir : dirs){
            int newM = i + dir[0];
            int newN = j + dir[1];
            if(newM >= 0 && newM < m && newN >= 0 && newN < n && grid[newM][newN]==1){
                size += helper(grid,newM,newN);
            }
        }

        return size;
    }
    public int maxAreaOfIsland(int[][] grid) {
        
        int max = 0;

        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[0].length; j++){
                if( grid[i][j]==1){
                    
                    max = Math.max(max,helper(grid,i,j));
                }
            }
        }
        return max;


    }
}