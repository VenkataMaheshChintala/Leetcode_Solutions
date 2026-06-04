public class leetcode_112 {
    boolean ans;
    public void helper(TreeNode root,int targetSum,int currentSum) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            if((currentSum+root.val) == targetSum) ans = true;
            return;
        }
        helper(root.left,targetSum,currentSum+root.val);
        helper(root.right,targetSum,currentSum+root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        ans = false;
        helper(root,targetSum,0);
        return ans;
    }
}
