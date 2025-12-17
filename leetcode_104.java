public class leetcode_104 {
    public int height(TreeNode node) {
        if(node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh,rh)+1;
    }
    public int maxDepth(TreeNode root) {
        return height(root);
    }
}
