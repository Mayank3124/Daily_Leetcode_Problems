class Solution {
    public void helper(int[][] res, int[][] dir, int idx, int num, int i, int j, int n){
        res[i][j] = num;

        if(i + dir[idx][0] >= 0 && i + dir[idx][0] < n && j + dir[idx][1] >= 0 && j + dir[idx][1] < n && res[i + dir[idx][0]][j + dir[idx][1]]==0){
            helper(res,dir,idx,num+1,i + dir[idx][0],j + dir[idx][1],n);
        }
        idx = (idx+1)%4;
        if(i + dir[idx][0] >= 0 && i + dir[idx][0] < n && j + dir[idx][1] >= 0 && j + dir[idx][1] < n && res[i + dir[idx][0]][j + dir[idx][1]]==0){
            helper(res,dir,idx,num+1,i + dir[idx][0],j + dir[idx][1],n);
        } 


    }
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        helper(res,dir,0,1,0,0,n);
        return res;

    }
}