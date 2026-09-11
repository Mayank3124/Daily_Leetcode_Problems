class Solution {
    public int countNeighbor(int i , int j, int[][] board){
        int m = board.length;
        int n = board[0].length;

        int[] dm = {-1,-1,-1,0,0,1,1,1};
        int[] dn = {-1,0,1,-1,1,-1,0,1};

        int count = 0;
        for(int k = 0; k < 8; k++){
            int newM = i + dm[k];
            int newN = j + dn[k];
            if(newM >= 0 && newM < m && newN >= 0 && newN < n){
                if(board[newM][newN] == 1 || board[newM][newN] == -1) count++;
            }
        }
        return count;
    }
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int neigh = countNeighbor(i,j,board);
                System.out.println(neigh);
                if( (neigh < 2 || neigh > 3) && board[i][j]==1) board[i][j] = -1;
                if(board[i][j]==0 && neigh == 3) board[i][j] = 2;
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j]==-1) board[i][j] = 0;
                if(board[i][j]==2) board[i][j] = 1;
            }
        }
    }
}