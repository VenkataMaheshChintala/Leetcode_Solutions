import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_993 {
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
    public boolean isCousins(TreeNode root, int x, int y) {
        List<List<TreeNode>> bfs = levelOrder(root);
        boolean b1=false,b2=false;
        int xi=-1,yi=-1;
        for(int i=0;i<bfs.size();i++) {
            List<TreeNode> list = bfs.get(i);
            b1 = false;
            b2 = false;
            for(int j=0;j<list.size();j++) {
                if(list.get(j) != null) {
                    if(list.get(j).val == x) {
                        b1 = true;
                        xi = j;
                    }
                    if(list.get(j).val == y) {
                        b2 = true;
                        yi = j;
                    }
                }
            }
            if(b1 && b2) {
                if((xi%2 == 0) && (yi != xi+1)) return true;
                if((xi%2 != 0) && (yi != xi-1)) return true;
            }
        }
        return false;
    }
}
