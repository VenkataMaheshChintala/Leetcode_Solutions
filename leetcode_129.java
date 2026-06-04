public class leetcode_129 {
    int ans;
    public void helper(TreeNode root,int currentSum) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            currentSum += root.val;
            ans += currentSum;
            return;
        }
        helper(root.right,(currentSum + root.val)*10);
        helper(root.left,(currentSum + root.val)*10);
    }
    public int sumNumbers(TreeNode root) {
        ans = 0;
        helper(root,0);
        return ans;
    }
}
