class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int StartRow = 0;
        int endCol = n-1;
        int endRow = n-1;
        int StartCol = 0;
        int num = 1;

        while(StartRow <= endRow && StartCol <= endCol){

            for(int i = StartCol; i <= endCol; i++){
                ans[StartRow][i] = num++;
            }
            StartRow++;

            for(int i = StartRow; i <= endRow; i++){
                ans[i][endCol] = num++;
            }
            endCol--;

            if(StartRow > endRow || StartCol > endCol) break;

            for(int i = endCol; i >= StartCol; i--){
                ans[endRow][i] = num++;
            }
            endRow--;

            for(int i = endRow; i >= StartRow; i--){
                ans[i][StartCol] = num++;
            }
            StartCol++;
        }
        return ans;
    }
}