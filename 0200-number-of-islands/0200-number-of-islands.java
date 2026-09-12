class Solution {
    public void helper(int i, int j, char[][] grid, boolean[][] check){
        int m = grid.length;
        int n = grid[0].length;
        check[i][j] = true;
        int[] dm = {1,0,-1,0};
        int[] dn = {0,1,0,-1};

        for(int k = 0; k < 4; k++){
            int newM = i + dm[k];
            int newN = j + dn[k];
            if(newM >= 0 && newM < m && newN >= 0 && newN < n && grid[newM][newN]=='1'){
                if(!check[newM][newN]){
                    
                    helper(newM,newN,grid,check);
                }
            } 
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] check = new boolean[m][n];
        int count = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!check[i][j] && grid[i][j] == '1'){
                    count++;
                    
                    helper(i,j,grid,check);
                }
            }
        }
        return count;
    }
}