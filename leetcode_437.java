public class leetcode_437 {
    int ans = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        helper(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return ans;
    }

    public void helper(TreeNode root, int targetSum, long currentSum) {
        if (root == null) return;
        currentSum += root.val;
        if (currentSum == targetSum) {
            ans++;
        }
        helper(root.left, targetSum, currentSum);
        helper(root.right, targetSum, currentSum);
    }
}
