public class leetcode_1315 {
    public int ans;
    public void helper(TreeNode node,TreeNode parent,TreeNode gp) {
        if(node == null) return;
        if((gp.val%2)==0) {
            ans += node.val;
        }
        helper(node.right,node,parent);
        helper(node.left,node,parent);
    }
    public int sumEvenGrandparent(TreeNode root) {
        if(root.right == null && root.left == null) return 0;
        ans = 0;
        TreeNode rootRight = root.right;
        TreeNode rootLeft = root.left;
        if(rootRight != null && rootLeft != null) {
            helper(rootRight.left,rootRight,root);
            helper(rootRight.right,rootRight,root);
            helper(rootLeft.left,rootLeft,root);
            helper(rootLeft.right,rootLeft,root);
        } else {
            if(rootLeft != null) {
                helper(rootLeft.left,rootLeft,root);
                helper(rootLeft.right,rootLeft,root);
            } else {
                helper(rootRight.left,rootRight,root);
                helper(rootRight.right,rootRight,root);
            }
        }
        return ans;
    }
}
