class Solution {
    public void helper(int[][] grid, int i, int j){
        int m = grid.length;
        int n = grid[0].length;
        grid[i][j] = 1;

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};

        for(int[] dir : dirs){
            int newM = i + dir[0];
            int newN = j + dir[1];
            if(newM >= 0 && newM < m && newN >= 0 && newN < n && grid[newM][newN]==0){
                helper(grid,newM,newN);
            } 
        }
    }
    public int closedIsland(int[][] grid) {

        for(int i = 0; i < grid.length; i++){
            if(grid[i][0]==0){
                helper(grid,i,0);
            }
            if(grid[i][grid[0].length-1]==0){
                helper(grid,i,grid[0].length -1);
            }
        }

        for(int i = 0; i <grid[0].length; i++){
            if(grid[0][i]==0){
                helper(grid,0,i);
            }
            if(grid[grid.length-1][i]==0){
                helper(grid,grid.length-1,i);
            }
        }
        int cnt = 0;

        for(int i = 1; i < grid.length -1; i++){
            for(int j = 1; j < grid[0].length -1; j++){
                if(grid[i][j]==0){
                    cnt++;
                    helper(grid,i,j);
                }
            }
        }
        return cnt;
        
    }
}