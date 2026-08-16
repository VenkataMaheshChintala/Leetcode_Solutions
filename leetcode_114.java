public class leetcode_114 {
    public TreeNode helper(TreeNode root) {
        if(root == null) return null;
        if(root.left == null && root.right == null) {
            return root;
        } else if(root.left != null && root.right != null) {
            TreeNode right = root.right;
            TreeNode left = root.left;
            root.left = null;
            root.right = helper(left);
            TreeNode temp = root;
            while(temp.right != null) {
                temp = temp.right;
            }
            temp.right = helper(right);
            return root;
        } else if (root.left == null) {
            root.right = helper(root.right);
            return root;
        } else {
            root.right = helper(root.left);
            root.left = null;
            return root;
        }
    }
    public void flatten(TreeNode root) {
        helper(root);
    }
}
