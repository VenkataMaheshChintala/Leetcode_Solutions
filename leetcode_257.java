import java.util.ArrayList;
import java.util.List;

public class leetcode_257 {
    List<String> ans;
    public void helper(TreeNode root,String path) {
        if(root == null) return;
        path += root.val;
        if(root.left == null && root.right == null) {
            ans.add(path);
            return;
        }
        path += "->";
        helper(root.left, path);
        helper(root.right, path);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        helper(root,new String(""));
        return ans;
    }
}
