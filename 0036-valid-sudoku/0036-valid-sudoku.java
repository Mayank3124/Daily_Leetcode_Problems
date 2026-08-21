class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j]!='.' && row.contains(board[i][j])){
                    return false;
                }
                row.add(board[i][j]);
                if(board[j][i]!='.' && col.contains(board[j][i])){
                    return false;
                }
                col.add(board[j][i]);

            }
        }
        for(int k = 0; k < 3; k++){
            HashSet<Character> mat1 = new HashSet<>();
            HashSet<Character> mat2 = new HashSet<>();
            HashSet<Character> mat3 = new HashSet<>();
        for(int i = 0; i < 3; i++){
            

            for(int j = 0; j < 3; j++){
                if(board[3*k + i][j]!='.' && mat1.contains(board[3*k + i][j])){
                    return false;
                }
                mat1.add(board[3*k + i][j]);
                if(board[3*k + i][3 + j]!='.' && mat2.contains(board[3*k + i][3 + j])){
                    return false;
                }
                mat2.add(board[3*k + i][3 + j]);
                if(board[3*k + i][6 + j]!='.' && mat3.contains(board[3*k + i][6 + j])){
                    return false;
                }
                mat3.add(board[3*k + i][6 + j]);
                

            }

        }}
        return true;
    }
}