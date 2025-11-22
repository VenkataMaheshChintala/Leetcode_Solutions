public class leetcode_52 {
    public boolean isSafe(int[][] board,int row,int col,int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row-1, j = col+1; j < n && i >= 0; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
    public int placeQueens(int[][] board,int row,int n,int ans) {
        if(row==n) {
            ans++;
            return ans;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board,row, col, n)) {
                board[row][col] = 1;
                ans = placeQueens(board, row + 1, n,ans);
                board[row][col] = 0;
            }
        }
        return ans;
    }
    public int totalNQueens(int n) {
        int[][] board = new int[20][20];
        for(int i=0;i<20;i++) {
            for(int j=0;j<20;j++) {
                board[i][j] = 0;
            }
        }
        int ans = 0;
        return placeQueens(board,0,n,ans);
    }
}
