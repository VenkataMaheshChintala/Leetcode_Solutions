import java.util.Arrays;

public class leetcode_79 {
    boolean[][] arr;
    public boolean helper(char[][] board,String word,int row,int col,int index) {
        if (index == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }
        if(!arr[row][col]) {
            if (index == 0 && board[row][col] != word.charAt(index)) return false;
            if (board[row][col] == word.charAt(index)) {
                arr[row][col] = true;
                boolean ans =  helper(board, word, row + 1, col, index + 1) ||
                        helper(board, word, row, col + 1, index + 1) ||
                        helper(board, word, row, col - 1, index + 1) ||
                        helper(board, word, row - 1, col, index + 1);
                arr[row][col] = false;
                return ans;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public boolean exist(char[][] board, String word) {
        arr = new boolean[board.length][board[0].length];
        boolean ans = false;
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                for(int k=0;k<arr.length;k++) {
                    Arrays.fill(arr[k],false);
                }
                ans = helper(board,word,i,j,0);
                if(ans) {
                    return true;
                }
            }
        }
        return false;
    }
}
