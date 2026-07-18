class Solution {
    public int deleteGreatestValue(int[][] grid) {

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int m = grid.length;
        int n = grid[0].length;

        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         pq.offer(grid[i][j]);

        //     }
        //     for(int j = 0; j < n; j++){
        //         grid[i][j] = pq.poll(); 
        //     }
        // }
        for(int[] arr : grid){
            Arrays.sort(arr);
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            int max = 0;
            for(int j = 0; j < m; j++){
                max = Math.max(max, grid[j][i]);
            }
            ans += max;
        }

        return ans;
    }
}