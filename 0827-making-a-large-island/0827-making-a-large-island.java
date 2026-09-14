class Solution {
    public int size(int[][] grid,int i,int j, int id){
        int n = grid[0].length;

        grid[i][j] = id;

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int size = 1;

        for(int[] dir : dirs){
            int newM = i + dir[0];
            int newN = j + dir[1];
            if(newM >= 0 && newM < n && newN >= 0 && newN < n && grid[newM][newN] == 1 ){
                size += size(grid,newM,newN,id);
            }
        }
        return size;

    }
    public boolean check(int n , int i, int j){
        return i >= 0 && i < n && j >= 0 && j < n;
    }
    public int largestIsland(int[][] grid) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int id = 2;
        int n = grid.length;
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j]==1){
                    int s = size(grid,i,j,id);
                    map.put(id,s);
                    max = Math.max(max,s);
                    id++;
                }
            }
        } 

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j]==0){
                    boolean[] visited = new boolean[id];
                    int sum = 1;
                    int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
                    for(int[] dir : dirs){
                        int newM = i + dir[0];
                        int newN = j + dir[1];
                        if(check(n,newM,newN) && grid[newM][newN] != 0 && !visited[grid[newM][newN]]){
                            visited[grid[newM][newN]] = true; 
                            sum += map.get(grid[newM][newN]);
                        }
                    }
                    max = Math.max(sum,max);
                }
            }
        }
        return max;
        
    }
}