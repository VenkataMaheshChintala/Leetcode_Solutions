public class leetcode_404 {
    public int helper(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        return sum + helper(root.left) + helper(root.right);
    } 
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root);       
    }
}
