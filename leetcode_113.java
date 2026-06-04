import java.util.ArrayList;
import java.util.List;

public class leetcode_113 {
    List<List<Integer>> ans;
    public void helper(TreeNode root, int targetSum, int currentSum, List<Integer> list) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            if((currentSum + root.val) == targetSum) {
                list.add(root.val);
                List<Integer> temp = new ArrayList<>();
                for(int i=0;i<list.size();i++) {
                    temp.add(list.get(i));
                }
                ans.add(new ArrayList<>(temp));
                list.removeLast();
            }
            return;
        }
        list.add(root.val);
        helper(root.left,targetSum,currentSum + root.val,list);
        helper(root.right,targetSum,currentSum + root.val,list);
        list.removeLast();
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans = new ArrayList<>();
        helper(root,targetSum,0,new ArrayList<>());
        return ans;
    }
}
