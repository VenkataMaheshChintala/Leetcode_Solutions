import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode_1305 {
    List<Integer> nodes;
    public void getNodes(TreeNode root) {
        if(root == null) return;
        nodes.add(root.val);
        getNodes(root.right);
        getNodes(root.left);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        nodes = new ArrayList<>();
        getNodes(root1);
        getNodes(root2);
        Collections.sort(nodes);
        return nodes;
    }
}
