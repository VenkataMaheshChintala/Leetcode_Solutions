import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return ans;
        queue.offer(root);
        int count = 0;
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
            if((count%2) == 0) {
                ans.add(list);
            } else {
                Collections.reverse(list);
                ans.add(list);
            }
            count++;
        }
        return ans;
    }
}
