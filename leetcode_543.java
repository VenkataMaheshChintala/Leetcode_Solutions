public class leetcode_543 {
    int diameter = 0;
    public int height(TreeNode node) {
        if(node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        int dia = lh + rh + 1;
        diameter = Math.max(diameter,dia);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int h = height(root);
        return diameter-1;
    }
}
