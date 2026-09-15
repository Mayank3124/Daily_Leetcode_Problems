class Solution {
    int MOD = 1000000007;
    public int maxPath(int[][] grid, int i, int j, int[] maxPaths){
        int m = grid.length;
        int n = grid[0].length;

        int sum = 1;
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};

        for(int[] dir : dirs){
            int newM = i + dir[0];
            int newN = j + dir[1];
            if(newM >= 0 && newM < m && newN >= 0 && newN < n && grid[i][j] < grid[newM][newN]){
                int idx = newM*n + newN;
                if(maxPaths[idx]==0){
                    maxPaths[idx]=maxPath(grid,newM,newN,maxPaths);
                }
                sum = (sum + maxPaths[idx]) % MOD; 
            }
        }
        return sum;
    }
    public int countPaths(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] maxPaths = new int[m*n];
        int sum = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int idx = i*n + j;
                if(maxPaths[idx] == 0 ){
                    maxPaths[idx] = maxPath(grid, i, j, maxPaths);
                }
                sum = (sum + maxPaths[idx]) % MOD;
            }
        }
        return sum;
    }
}