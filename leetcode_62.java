import java.util.Arrays;

public class leetcode_62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++) {
            Arrays.fill(dp[i],-1);
        }
        return helper(0, 0, m - 1, n - 1, dp);
    }
    public static int helper(int m,int n,int targetM,int targetN,int[][] dp) {
        if(m > targetM || n > targetN) return 0;
        if(dp[m][n] != -1) return dp[m][n];
        if(m == targetM && n == targetN) return 1;
        int a = helper(m+1,n,targetM,targetN,dp);
        int b = helper(m,n+1,targetM,targetN,dp);
        return dp[m][n] = a+b;
    }
}
