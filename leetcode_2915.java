import java.util.Arrays;
import java.util.List;

public class leetcode_2915 {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[nums.size()][target + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        int result = helper(nums, target, 0, 0, dp);
        return result <= 0 ? -1 : result;
    }
    public int helper(List<Integer> nums, int target, int index, int current_sum, int[][] dp) {
        if (current_sum == target) return 0;
        if (index == nums.size() || current_sum > target) return -1001;
        if (dp[index][current_sum] != -1) return dp[index][current_sum];
        int pick = 1 + helper(nums, target, index + 1, current_sum + nums.get(index), dp);
        int skip = helper(nums, target, index + 1, current_sum, dp);
        return dp[index][current_sum] = Math.max(pick, skip);
    }
}
