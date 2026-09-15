class Solution {
    public int maxPath(int[][] grid, int i, int j, HashMap map){
        int m = grid.length;
        int n = grid[0].length;

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int max = 0;
        for(int[] dir : dirs){
            int newM = i + dir[0];
            int newN = j + dir[1];
            if(newM >= 0 && newM < m && newN >= 0 && newN < n && grid[i][j] < grid[newM][newN]){
                int key = newM*n + newN;
                int val = (int)map.getOrDefault(key,-1);
                if(val == -1){
                    val = maxPath(grid,newM,newN,map);
                    map.put(newM*n + newN,val);
                }
                max = Math.max(max,val);
                
            }
        }
        return max + 1;


    }
    public int longestIncreasingPath(int[][] grid) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int key = i*n + j;
                int val = map.getOrDefault(key,-1);
                if(val == -1){
                    val = maxPath(grid,i,j,map);
                    map.put(key,val);
                }
                max = Math.max(max,val);
            }
        }

        return max;

    }
}