public class leetcode_2236 {
    public boolean checkTree(TreeNode root) {
        if((root.right.val + root.left.val) == root.val) return true;
        else return false;
    }
}
