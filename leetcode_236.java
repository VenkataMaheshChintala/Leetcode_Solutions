import java.util.ArrayList;
import java.util.List;

public class leetcode_236 {
    public List<TreeNode> findAncestors(TreeNode root,TreeNode node) {
        List<TreeNode> list = new ArrayList<>();
        boolean a = findAncestors(root,node,list);
        return list;
    }

    public boolean findAncestors(TreeNode root, TreeNode node, List<TreeNode> list) {
        if (root == null) {
            return false;
        }
        if (root == node) {
            list.add(root);
            return true;
        }
        boolean foundInLeft = findAncestors(root.left, node, list);
        boolean foundInRight = findAncestors(root.right, node, list);
        if (foundInLeft || foundInRight) {
            list.add(root);
            return true;
        }
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1 = new ArrayList<>();
        list1 = findAncestors(root,p);
        List<TreeNode> list2 = new ArrayList<>();
        list2 = findAncestors(root,q);
        int i,j;
        for(i=list1.size()-1,j=list2.size()-1;i>=0 && j>=0;i--,j--) {
            if(list1.get(i) != list2.get(j)) return list1.get(i+1);
        }
        return i < 0 ? list1.get(0) : list2.get(0);
    }
}
