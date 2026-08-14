public class leetcode_617 {
    public TreeNode helper(TreeNode node1,TreeNode node2) {
        if(node1 != null && node2 != null) {
            TreeNode node = new TreeNode(node1.val + node2.val);
            node.right = helper(node1.right,node2.right);
            node.left = helper(node1.left,node2.left);
            return node;
        } else if (node1 != null && node2 == null) {
            TreeNode node = new TreeNode(node1.val);
            node.right = helper(node1.right,null);
            node.left = helper(node1.left,null);
            return node;
        } else if (node1 == null && node2 != null) {
            TreeNode node = new TreeNode(node2.val);
            node.right = helper(null,node2.right);
            node.left = helper(null,node2.left);
            return node;
        } else {
            return null;
        }
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 != null && root2 != null) {
            TreeNode root = new TreeNode(root1.val + root2.val);
            root.right = helper(root1.right,root2.right);
            root.left = helper(root1.left,root2.left);
            return root;
        } else if (root1 != null && root2 == null) {
            return root1;
        } else if (root1 == null && root2 != null) {
            return root2;
        } else {
            return null;
        }
    }
}
