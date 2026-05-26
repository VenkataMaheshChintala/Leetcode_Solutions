import java.util.Arrays;

public class leetcode_1312 {
    static int[][] dp;
    public int helper(int i,int j, String s) {
        if(i < 0 || j >= s.length() || i > j) return 0;
        if((j-i)==0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == s.charAt(j)) return dp[i][j] = helper(i+1,j-1,s);
        else {
            return dp[i][j] = 1 + Math.min(helper(i+1,j,s),helper(i,j-1,s));
        }
    }
    public int minInsertions(String s) {
        dp = new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++) {
            Arrays.fill(dp[i],-1);
        }
        return helper(0,s.length()-1,s);
    }
}
