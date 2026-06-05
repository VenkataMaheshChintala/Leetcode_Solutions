import java.util.Arrays;

public class leetcode_518 {
    int ans;
    int[][] dp;
    public int helper(int amount,int[] coins,int currentAmount,int index) {
        if(currentAmount == amount) return 1;
        if(currentAmount > amount) {
            return 0;
        }
        if(index == coins.length) return 0;
        if(dp[currentAmount][index] != -1) return dp[currentAmount][index];
        return dp[currentAmount][index] = helper(amount,coins,currentAmount+coins[index],index) + helper(amount,coins,currentAmount,index+1);
    }
    public int change(int amount, int[] coins) {
        dp = new int[amount + 1][coins.length];
        for(int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(amount, coins, 0, 0);
    }
}
