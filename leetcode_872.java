import java.util.ArrayList;
import java.util.List;

public class leetcode_872 {
    List<Integer> list;
    public void helper(TreeNode root) {
        if(root==null) return;
        if(root.left == null && root.right == null) {
            list.add(root.val);
        }
        helper(root.left);
        helper(root.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        list = new ArrayList<>();
        helper(root1);
        List<Integer> list1 = new ArrayList<>(list);
        list = new ArrayList<>();
        helper(root2);
        if(list.size() != list1.size()) return false;
        else {
            for(int i=0;i<list.size();i++) {
                if(!list.get(i).equals(list1.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
