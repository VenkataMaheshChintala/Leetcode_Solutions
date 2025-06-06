import java.util.ArrayList;
import java.util.List;

public class leetcode_94 {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }
    public List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }   
}
