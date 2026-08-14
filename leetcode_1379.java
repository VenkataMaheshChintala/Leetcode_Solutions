public class leetcode_1379 {
    public TreeNode helper(TreeNode originalNode, TreeNode cloneNode,TreeNode target) {
        if(originalNode == null) return null;
        if(originalNode == target) return cloneNode;
        TreeNode a = helper(originalNode.right,cloneNode.right,target);
        TreeNode b = helper(originalNode.left,cloneNode.left,target);
        if(a == null) {
            return b;
        } else {
            return a;
        }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == target) return cloned;
        TreeNode a = helper(original.right,cloned.right,target);
        TreeNode b = helper(original.left,cloned.left,target);
        if(a == null) {
            return b;
        } else {
            return a;
        }
    }
}
