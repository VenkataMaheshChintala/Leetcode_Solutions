import java.util.ArrayList;
import java.util.List;

public class leetcode_51 {
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
    public List<List<String>> placeQueens(int[][] board,int row,int n,List<List<String>> ans) {
        if(row==n) {
            List<String> temp = new ArrayList<>();
            StringBuilder str;
            for(int i=0;i<n;i++) {
                str = new StringBuilder();
                for(int j=0;j<n;j++) {
                    if(board[i][j] == 1) {
                        str.append("Q");
                    } else {
                        str.append(".");
                    }
                }
                temp.add(str.toString());
            }
            ans.add(temp);
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
    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[20][20];
        for(int i=0;i<20;i++) {
            for(int j=0;j<20;j++) {
                board[i][j] = 0;
            }
        }
        List<List<String>> ans = new ArrayList<>();
        return placeQueens(board,0,n,ans);
    }
}
