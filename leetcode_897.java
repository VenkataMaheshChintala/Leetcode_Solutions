import java.util.ArrayList;
import java.util.List;

public class leetcode_897 {
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }
    public List<Integer> list;
    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        list = new ArrayList<>();
        inorder(root);
        TreeNode ans = new TreeNode(list.get(0));
        ans.left = null;
        TreeNode temp = ans;
        TreeNode temp1;
        for(int i=1;i<list.size();i++) {
            temp1 = new TreeNode(list.get(i));
            temp1.left = null;
            temp.right = temp1;
            temp = temp1;
        }
        temp.right = null;
        return ans;
    }
}
