public class leetcode_559 {
    public int helper(Node root,int d) {
        if(root == null) return 0;
        if(root.children.size() == 0) return d;
        int ans = 0;
        for(int i=0;i<root.children.size();i++) {
            ans = Math.max(helper(root.children.get(i),d+1),ans);
        }
        return ans;
    }
    public int maxDepth(Node root) {
        return helper(root,1);
    }
}
