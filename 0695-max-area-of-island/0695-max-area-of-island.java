class Solution {
    public int helper(int[][] grid, int i, int j, boolean[][] check){
        int m = grid.length;
        int n = grid[0].length;

        check[i][j] = true;

        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

        int size = 0;

        for(int k = 0; k < 4; k++){
            int newM = i + dir[k][0];
            int newN = j + dir[k][1];
            if(newM >= 0 && newM < m && newN >= 0 && newN < n && !check[newM][newN] && grid[newM][newN]==1){
                size += helper(grid,newM,newN,check);
            }
        }

        return size+1;
    }
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] check = new boolean[grid.length][grid[0].length];

        int max = 0;

        for(int i = 0; i < grid.length; i++ ){
            for(int j = 0; j < grid[0].length; j++){
                if(!check[i][j] && grid[i][j]==1){
                    
                    max = Math.max(max,helper(grid,i,j,check));
                }
            }
        }
        return max;


    }
}