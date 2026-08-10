public class leetcode_486 {
    public boolean helper(int p1,int p2,int start,int end,int[] nums,boolean turn) {
        if(start>end) return p1 >= p2;
        boolean a=false,b=false;
        if(turn) {
            a = helper(p1 + nums[start],p2,start+1,end,nums,!turn);
            b = helper(p1 + nums[end],p2,start,end-1,nums,!turn);
            return a || b;
        } else {
            a = helper(p1,p2 + nums[start],start+1,end,nums,!turn);
            b = helper(p1,p2 + nums[end],start,end-1,nums,!turn);
            return a && b;
        }
    }
    public boolean predictTheWinner(int[] nums) {
        return helper(0,0,0,nums.length-1,nums,true);
    }
}
