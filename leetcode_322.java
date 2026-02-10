import java.util.Arrays;

public class leetcode_322 {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++) {
            Arrays.fill(dp[i],-1);
        }
        int a = helper(coins,amount,0,dp);
        if(a==Integer.MAX_VALUE-1) return -1;
        else return a;
    }
    public int helper(int[] coins,int amount,int index,int[][] dp) {
        if(index == coins.length) {
            if(amount == 0) return 0;
            else return Integer.MAX_VALUE-1;
        }
        if(dp[index][amount] != -1) return dp[index][amount];
        int skip = helper(coins,amount,index+1,dp);
        if(amount - coins[index] < 0) return skip;
        int pick = 1 + helper(coins,amount-coins[index],index,dp);
        return dp[index][amount] = Math.min(skip,pick);
    }
}
