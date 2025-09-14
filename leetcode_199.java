import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_199 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return ans;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int ls = queue.size();
            List<Integer> list = new ArrayList<>(ls);
            for(int i=0;i<ls;i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) {
                    queue.offer(node.left);
                } 
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> ans = levelOrder(root);
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<ans.size();i++) {
            List<Integer> temp = ans.get(i);
            res.add(temp.getLast());
        }
        return res;
    }
}
