class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int StartRow = 0;
        int endCol = matrix[0].length -1;
        int endRow = matrix.length -1;
        int StartCol = 0;

        while(StartRow <= endRow && StartCol <= endCol){
            for(int i = StartCol; i <= endCol; i++){
                ans.add(matrix[StartRow][i]);
            }
            StartRow++;
            for(int i = StartRow; i <= endRow; i++){
                ans.add(matrix[i][endCol]);
            }
            endCol--;
            if(StartRow > endRow || StartCol > endCol) break;
            for(int i = endCol; i >= StartCol; i--){
                ans.add(matrix[endRow][i]);
            }
            endRow--;
            for(int i = endRow; i >= StartRow; i--){
                ans.add(matrix[i][StartCol]);
            }
            StartCol++;
        }
        return ans;
    }
}