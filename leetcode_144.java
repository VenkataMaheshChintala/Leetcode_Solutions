import java.util.ArrayList;
import java.util.List;

public class leetcode_144 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    
    }
    public List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }
    public void preorder(TreeNode root) {
        if(root == null) return;
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
