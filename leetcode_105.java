public class leetcode_105 {
    public int find(int ele,int[] arr,int start,int end) {
        for(int i = start;i<=end;i++) {
            if(arr[i] == ele) return i;
        }
        return -1;
    }
    public TreeNode helper(int[] preorder,int prestart,int preend,int[] inorder,int inorderstart,int inorderend) {
        if(prestart > preend) return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int ind = find(preorder[prestart],inorder,inorderstart,inorderend);
        int ls = ind - inorderstart;
        int rs = inorderend - ind;
        root.left = helper(preorder,prestart+1,prestart+ls,inorder,inorderstart,ind-1);
        root.right = helper(preorder,prestart+ls+1,preend,inorder,ind+1,inorderend);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
    }
}
