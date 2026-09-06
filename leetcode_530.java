import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode_530 {
    List<Integer> list;
    public void getNodes(TreeNode root) {
        if(root == null) return;
        list.add(root.val);
        getNodes(root.right);
        getNodes(root.left);
    }
    public int getMinimumDifference(TreeNode root) {
        list = new ArrayList<>();
        getNodes(root);
        Collections.sort(list);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++) {
            ans = Math.min(Math.abs(list.get(i)-list.get(i+1)),ans);
        } 
        return ans;
    }
}
