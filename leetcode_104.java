import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_104 {
    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     if(root == null) return ans;
    //     queue.offer(root);
    //     while(!queue.isEmpty()) {
    //         int ls = queue.size();
    //         List<Integer> list = new ArrayList<>(ls);
    //         for(int i=0;i<ls;i++) {
    //             TreeNode node = queue.poll();
    //             list.add(node.val);
    //             if(node.left != null) {
    //                 queue.offer(node.left);
    //             } 
    //             if(node.right != null) {
    //                 queue.offer(node.right);
    //             }
    //         }
    //         ans.add(list);
    //     }
    //     return ans;
    // }
    // public int maxDepth(TreeNode root) {
    //     List<List<Integer>> list = levelOrder(root);
    //     return list.size();
    // }
    public int height(TreeNode node) {
        if(node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh,rh)+1;
    }
    public int maxDepth(TreeNode root) {
        return height(root);
    }
}
