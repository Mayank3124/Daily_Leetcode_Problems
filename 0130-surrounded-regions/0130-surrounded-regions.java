class Solution {
    public void helper(char[][] board, int i ,int j, boolean[][] check){
        int m = board.length;
        int n = board[0].length;

        check[i][j] = true;

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        for(int[] dir : dirs){
            int newM = i + dir[0];
            int newN = j + dir[1];
            if(newM >= 0 && newM < m && newN >= 0 && newN < n && !check[newM][newN] && board[newM][newN]=='O'){
                helper(board,newM,newN,check);
            }
        }
    }
    public void helper2(char[][] board, int i,int j){
        int m = board.length;
        int n = board[0].length;

        board[i][j] = 'X';

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        for(int[] dir : dirs){
            int newM = i + dir[0];
            int newN = j + dir[1];
            if(newM >= 0 && newM < m && newN >= 0 && newN < n && board[newM][newN]=='O'){
                helper2(board,newM,newN);
            }
        }
    }
    public void solve(char[][] board) {
        boolean[][] check = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            if(!check[i][0] && board[i][0]=='O'){
                helper(board,i,0,check);
            }
            if(!check[i][board[0].length-1] && board[i][board[0].length-1]=='O'){
                helper(board,i,board[0].length-1,check);
            }
        }

        for(int i = 0; i < board[0].length; i++){
            if(!check[0][i] && board[0][i]=='O'){
                helper(board,0,i,check);
            }
            if(!check[board.length-1][i] && board[board.length -1][i]=='O'){
                helper(board,board.length-1,i,check);
            }
        }

        for(int i = 1; i < board.length-1; i++){
            for(int j = 1; j < board[0].length-1; j++){
                if(!check[i][j] && board[i][j] == 'O'){
                    helper2(board,i,j);
                }
            }
        }
    }
}