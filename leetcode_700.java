public class leetcode_700 {
    public TreeNode helper(TreeNode root,int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        if(root.val > val) {
            return helper(root.left,val);
        } else {
            return helper(root.right,val);
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return helper(root,val);
    }
}
