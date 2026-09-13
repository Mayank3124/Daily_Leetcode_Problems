class Solution {
    public void helper(List ans, int i, int j, int[][] matrix, boolean[][] check,int idx, int[][]dir){
        int m = matrix.length;
        int n = matrix[0].length;

        check[i][j] = true;
        ans.add(matrix[i][j]);

        if( i + dir[idx][0] >= 0 && i + dir[idx][0] < m && j + dir[idx][1] >= 0 && j + dir[idx][1] < n && !check[i+dir[idx][0]][j+dir[idx][1]]){
            helper(ans, i + dir[idx][0], j + dir[idx][1], matrix, check,idx, dir);
        }
        idx = (idx+1)%4;
        if( i + dir[idx][0] >= 0 && i + dir[idx][0] < m && j + dir[idx][1] >= 0 && j + dir[idx][1] < n && !check[i+dir[idx][0]][j+dir[idx][1]]){
            helper(ans, i + dir[idx][0], j + dir[idx][1], matrix, check,idx, dir);
        }

        
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        helper(ans,0,0,matrix,new boolean[matrix.length][matrix[0].length],0, dir);
        return ans;
    }
}