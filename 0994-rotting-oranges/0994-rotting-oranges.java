class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            max++;
            int size = q.size();
            while(size-- > 0){
                int[] idx = q.poll();
                for(int[] dir : dirs){
                    int newM = idx[0] + dir[0];
                    int newN = idx[1] + dir[1];
                    if(newM >= 0 && newM < m && newN >= 0 && newN < n && grid[newM][newN]==1){
                        grid[newM][newN] = 2;
                        q.add(new int[]{newM,newN});
                    }
                }
            }
        }
        
        for(int[] g : grid){
            for(int o : g ){
                if(o==1){
                    return -1;
                }
            }
        }
        return (max==0)? max: max -1;
    }
}