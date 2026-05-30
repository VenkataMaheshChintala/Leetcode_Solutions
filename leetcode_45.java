import java.util.Arrays;

public class leetcode_45 {
    public static int helper(int[] nums,int index) {
        if(index >= nums.length) return Integer.MAX_VALUE;
        if(index == nums.length-1) return 0;
        if(dp[index] != -1) return dp[index];
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<=nums[index];i++) {
            int nextJumpResult = helper(nums, index + i);
            if (nextJumpResult != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + nextJumpResult);
            }
        }
        return dp[index] = ans;
    }
    static int[] dp;
    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0);
    }
}
