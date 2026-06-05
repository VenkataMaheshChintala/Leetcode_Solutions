public class leetcode_37 {
    public boolean isSafe(char[][] board,int row,int col,char value) {
        // row
        for(int j = 0; j < 9; j++) {
            if(board[row][j] == value) {
                return false;
            }
        }
        // column
        for(int i = 0; i < 9; i++) {
            if(board[i][col] == value) {
                return false;
            }
        }
        // 3x3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for(int i = startRow; i < startRow + 3; i++) {
            for(int j = startCol; j < startCol + 3; j++) {
                if(board[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board,int row,int col) {
        if(row == 9) {
            return true;
        }
        for(int i = row; i < 9; i++) {
            int startCol = (i == row) ? col : 0;
            for(int j = startCol; j < 9; j++) {
                if(board[i][j] == '.') {
                    for(char value = '1'; value <= '9'; value++) {
                        if(isSafe(board, i, j, value)) {
                            board[i][j] = value;
                            int nextRow = i;
                            int nextCol = j + 1;
                            if(nextCol == 9) {
                                nextRow++;
                                nextCol = 0;
                            }
                            if(helper(board, nextRow, nextCol)) {
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
}
