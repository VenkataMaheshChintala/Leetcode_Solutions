public class leetcode_2265 {
    public int nnodes;
    public int sum;
    public int count;

    public void nodes(TreeNode node) {
        if(node == null) return;
        nnodes++;
        nodes(node.right);
        nodes(node.left);
    }
    public void average(TreeNode node) {
        if(node == null) return;
        sum += node.val;
        average(node.right);
        average(node.left);
    }
    public void helper(TreeNode root) {
        if(root == null) return;
        nnodes = 0;
        sum = 0;
        average(root);
        nodes(root);
        if((sum/nnodes) == root.val) count++;
        helper(root.right);
        helper(root.left);
    }
    public int averageOfSubtree(TreeNode root) {
        count = 0;
        helper(root);
        return count;
    }
}
