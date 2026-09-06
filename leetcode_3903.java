public class leetcode_3903 {
    public int max(int[] nums,int start,int end) {
        int ans = Integer.MIN_VALUE;
        for(int i=start;i<=end;i++) {
            ans = Math.max(ans,nums[i]);
        }
        return ans;
    }
    public int min(int[] nums,int start,int end) {
        int ans = Integer.MAX_VALUE;
        for(int i=start;i<=end;i++) {
            ans = Math.min(ans,nums[i]);
        }
        return ans;
    }
    public int firstStableIndex(int[] nums, int k) {
        int ma=-1,mi=-1,s=-1;
        for(int i=0;i<nums.length;i++) {
            ma = max(nums,0,i);
            mi = min(nums,i,nums.length-1);
            s = ma - mi;
            if(s <= k) return i;
        }
        return -1;
    }
}
