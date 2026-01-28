import java.util.Arrays;

public class leetcode_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
	    for(int i=0;i<obstacleGrid.length;i++) {
	        Arrays.fill(dp[i],-1);
	    }
        return helper(obstacleGrid,0,0,dp,obstacleGrid.length-1,obstacleGrid[0].length-1);
    }
    public int helper(int[][] obstacleGrid,int row,int col,int[][] dp,int tRow,int tCol) {
        if(row > tRow || col > tCol) return 0;
        if(obstacleGrid[row][col] != 1) {
            if(dp[row][col] != -1) return dp[row][col];
            if(row == tRow && col == tCol) return 1;
            int a = helper(obstacleGrid,row+1,col,dp,tRow,tCol);
            int b = helper(obstacleGrid,row,col+1,dp,tRow,tCol);
            return dp[row][col] = a + b;
        } else {
            return 0;
        }
    }
}
