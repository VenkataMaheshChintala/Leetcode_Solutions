import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_100 {
    public List<List<TreeNode>> levelOrder(TreeNode root) {
        List<List<TreeNode>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return ans;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int ls = queue.size();
            List<TreeNode> list = new ArrayList<>(ls);
            for(int i=0;i<ls;i++) {
                TreeNode node = queue.poll();
                list.add(node);
                if(node != null) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<List<TreeNode>> bfs_p = levelOrder(p);
        List<List<TreeNode>> bfs_q = levelOrder(q);
        return bfs_p.equals(bfs_q);
    }
}
