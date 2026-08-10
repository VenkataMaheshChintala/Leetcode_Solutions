public class leetcode_938 {
    public int sum;
    public void helper(TreeNode node,int low,int high) {
        if(node == null) return;
        if(node.val >= low && node.val <= high) {
            sum += node.val;
        }
        helper(node.right,low,high); 
        helper(node.left,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        helper(root,low,high);
        return sum;
    }
}
