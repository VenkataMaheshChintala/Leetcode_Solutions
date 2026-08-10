public class leetcode_110 {
    public int depth(TreeNode root) {
        if(root == null) return 0;
        int rd = helper(root.right,1);
        int ld = helper(root.left,1);
        return Math.max(rd,ld);
    }
    public int helper(TreeNode root,int depth) {
        if(root == null) return depth;
        int rd = helper(root.right,depth+1);
        int ld = helper(root.left,depth+1);
        return Math.max(rd,ld);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int rd = depth(root.right);
        int ld = depth(root.left);
        System.out.println(rd + " " + ld);
        if(Math.abs(rd-ld)>1) return false;
        else {
            if(root.left == null) {
                if(root.right == null) {
                    return true;
                } else {
                    return isBalanced(root.right);
                }
            } 
            if(root.right == null) {
                if(root.left == null) {
                    return true;
                } else return isBalanced(root.left);
            }
            return isBalanced(root.right) && isBalanced(root.left);
        }
    }
}
