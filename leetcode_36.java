import java.util.ArrayList;
import java.util.List;

public class leetcode_36 {
    public boolean isValidSudoku(char[][] board) {
        List<Character> list = new ArrayList<>();
        for(int j=0;j<9;j++) {
            list = new ArrayList<>();
            for(int i=0;i<9;i++) {
                if(board[j][i] != '.') {
                    if(!list.contains(board[j][i])) list.add(board[j][i]);
                    else return false;
                }
            }
        }
        for(int j=0;j<9;j++) {
            list = new ArrayList<>();
            for(int i=0;i<9;i++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        list = new ArrayList<>();
        for(int i=0;i<=2;i++) {
            for(int j=0;j<=2;j++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        list = new ArrayList<>();
        for(int i=0;i<=2;i++) {
            for(int j=3;j<=5;j++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        list = new ArrayList<>();
        for(int i=0;i<=2;i++) {
            for(int j=6;j<=8;j++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        list = new ArrayList<>();
        for(int i=3;i<=5;i++) {
            for(int j=0;j<=2;j++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        list = new ArrayList<>();
        for(int i=3;i<=5;i++) {
            for(int j=3;j<=5;j++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        list = new ArrayList<>();
        for(int i=3;i<=5;i++) {
            for(int j=6;j<=8;j++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        list = new ArrayList<>();
        for(int i=6;i<=8;i++) {
            for(int j=0;j<=2;j++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        list = new ArrayList<>();
        for(int i=6;i<=8;i++) {
            for(int j=3;j<=5;j++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        list = new ArrayList<>();
        for(int i=6;i<=8;i++) {
            for(int j=6;j<=8;j++) {
                if(board[i][j] != '.') {
                    if(!list.contains(board[i][j])) list.add(board[i][j]);
                    else return false;
                }
            }
        }
        return true;
    }
}
