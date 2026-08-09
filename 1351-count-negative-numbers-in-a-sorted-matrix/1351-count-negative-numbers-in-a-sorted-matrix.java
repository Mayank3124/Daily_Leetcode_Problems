class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int r = n;
        int sum = 0;
        for(int i = 0; i < m; i++){
            int l = 0;
            while(l < r){
                int mid = l + (r - l)/2;
                if(grid[i][mid] < 0){
                    r = mid;
                }else{
                    l = mid+1;
                }
            }
            sum += n-r;
            
            
        }
        return sum;
        

        
    }
}