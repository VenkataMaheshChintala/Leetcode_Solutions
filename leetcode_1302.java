public class leetcode_1302 {
    public int sum;
    public int height(TreeNode node) {
        if(node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh,rh)+1;
    }
    public int maxDepth(TreeNode root) {
        return height(root);
    }
    public void helper(TreeNode root,int currentDepth,int maxDepth) {
        if(root == null) return;
        if(currentDepth == maxDepth) sum += root.val;
        helper(root.right,currentDepth+1,maxDepth);
        helper(root.left,currentDepth+1,maxDepth);
    }
    public int deepestLeavesSum(TreeNode root) {
        int maxdepth = maxDepth(root);
        sum = 0;
        helper(root,1,maxdepth);
        return sum;
    }
}
