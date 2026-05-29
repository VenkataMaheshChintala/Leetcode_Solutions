import java.util.Arrays;

public class leetcode_5 {
    private int[][] dp;
    private String longestStr;
    public int checkPalindrome(String s, int start, int end) {
        if (start >= end) return 1; 
        if (dp[start][end] != -1) {
            return dp[start][end];
        }
        if (s.charAt(start) == s.charAt(end)) {
            dp[start][end] = checkPalindrome(s, start + 1, end - 1);
        } else {
            dp[start][end] = 0;
        }
        if (dp[start][end] == 1) {
            int currentLength = end - start + 1;
            if (currentLength > longestStr.length()) {
                longestStr = s.substring(start, end + 1);
            }
        }
        return dp[start][end];
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int n = s.length();
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        longestStr = s.substring(0, 1);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                checkPalindrome(s, i, j);
            }
        }

        return longestStr;
    }
}
