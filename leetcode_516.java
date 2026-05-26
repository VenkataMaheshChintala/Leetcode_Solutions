import java.util.Arrays;

public class leetcode_516 {
    static int[][] dp;
    public int helper(int i,int j,StringBuilder text1,StringBuilder text2) {
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + helper(i-1,j-1,text1,text2);
        } else {
            return dp[i][j] = Math.max(helper(i-1,j,text1,text2),helper(i,j-1,text1,text2));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder t1 = new StringBuilder(text1);
        StringBuilder t2 = new StringBuilder(text2);
        dp = new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++) {
            Arrays.fill(dp[i],-1);
        }
        return helper(text1.length()-1,text2.length()-1,t1,t2);
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder str1 = new StringBuilder(s);
        String st = str1.reverse().toString();
        return longestCommonSubsequence(s,st);
    }
}
