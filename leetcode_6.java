import java.util.Arrays;
public class leetcode_6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s,numRows));
    }
    public static String convert(String s,int numRows) {
        if (numRows == 1) {
            System.out.println(s);
            return s;
        }
        char ans[][] = new char[numRows][s.length()];
        String result = "";
        int i=0,j=0;
        int col = 0;
        int ch=0;
        for(i=0;i<ans.length;i++) {
            Arrays.fill(ans[i],' ');
        }
        while (ch < s.length()) {
            for(i=0;i<numRows && ch < s.length();i++) {
                ans[i][col] = s.charAt(ch);
                ch++;
            }
            for (i = numRows - 2; i > 0 && ch < s.length(); i--) {
                col++;
                ans[i][col] = s.charAt(ch);
                ch++;
            }
            col++;
        }
        for(i=0;i<ans.length;i++) {
            for(j=0;j<ans[i].length;j++) {
                if(!(ans[i][j] == ' ')) {
                    result += ans[i][j];
                }
            }
        }
        return result;
    }
}
