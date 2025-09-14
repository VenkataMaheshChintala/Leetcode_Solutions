import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_117 {
    public List<List<Node>> levelOrder(Node root) {
        List<List<Node>> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root == null) return ans;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int ls = queue.size();
            List<Node> list = new ArrayList<>(ls);
            for(int i=0;i<ls;i++) {
                Node node = queue.poll();
                list.add(node);
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
    public Node connect(Node root) {
        List<List<Node>> nodes = levelOrder(root);
        for(int i=1;i<nodes.size();i++) {
            List<Node> list = nodes.get(i);
            for(int j=0;j<list.size()-1;j++) {
                Node node = list.get(j);
                node.next = list.get(j+1);
            }
            Node node = list.get(list.size()-1);
            node.next = null;
        }
        return root;
    }
}
