import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return ans;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int ls = queue.size();
            long sum = 0;
            for(int i=0;i<ls;i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null) {
                    queue.offer(node.left);
                } 
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(sum*1.0/ls);
        }
        return ans;
    }
}
