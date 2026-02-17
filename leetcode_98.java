import java.util.ArrayList;
import java.util.List;

public class leetcode_98 {
    public List<Integer> inorderList(TreeNode TreeNode, List<Integer> list) {
        if(TreeNode == null) {
            return list;
        }
        inorderList(TreeNode.left,list);
        list.add(TreeNode.val);
        inorderList(TreeNode.right,list);
        return list;
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = inorderList(root,list);
        boolean flag = true;
        for(int i=0;i<list.size()-1;i++) {
            if(list.get(i) >= list.get(i+1)) {
                flag = false;
                return false;
            }
        }
        return flag;
    }
}
