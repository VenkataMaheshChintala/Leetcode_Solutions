public class leetcode_931 {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++) {
            dp[i] = matrix[n-1][i];
        }
        for(int i=n-2;i>=0;i--) {
            int[] currentDP = new int[n];
            for(int j=0;j<n;j++) {
                if(j==0) {
                    currentDP[j] = matrix[i][j] + Math.min(dp[j],dp[j+1]);
                } else if (j==n-1) {
                    currentDP[j] = matrix[i][j] + Math.min(dp[j],dp[j-1]);
                } else {
                    currentDP[j] = matrix[i][j] + Math.min(dp[j],Math.min(dp[j-1],dp[j+1]));
                }
            }
            for(int j=0;j<n;j++) {
                dp[j] = currentDP[j];
            }
        }
        int min = dp[0];
        for (int i = 1; i < dp.length; i++) {
            if (dp[i] < min) {
                min = dp[i];
            }
        }
        return min;
    }
}
