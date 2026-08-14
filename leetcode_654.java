public class leetcode_654 {
    public int[] maxVal(int[] nums,int start,int end) {
        int[] arr = new int[2];
        arr[0] = Integer.MIN_VALUE;
        for(int i=start;i<=end;i++) {
            if(nums[i] > arr[0]) {
                arr[0] = nums[i];
                arr[1] = i;
            }
        }
        return arr;
    }
    public TreeNode create(int[] nums,int start,int end) {
        if(start > end) return null;
        int[] max = maxVal(nums,start,end);
        TreeNode node = new TreeNode(max[0]);
        node.right = create(nums,max[1]+1,end);
        node.left = create(nums,start,max[1]-1);
        return node;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int[] max = maxVal(nums,0,nums.length-1);
        TreeNode root = new TreeNode(max[0]);
        root.right = create(nums,max[1]+1,nums.length-1);
        root.left = create(nums,0,max[1]-1);
        return root;
    }
}
