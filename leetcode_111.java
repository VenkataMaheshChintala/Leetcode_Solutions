public class leetcode_111 {
    public int height(TreeNode root) {
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.min(lh,rh)+1;
    }
    public int minDepth(TreeNode root) {
        return height(root);
    }
}
