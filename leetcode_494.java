public class leetcode_494 {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    public int helper(int[] nums,int target,int index,int current_value) {
        if(index == nums.length) {
            if(target == current_value) return 1;
            else return 0;
        }
        int positive = helper(nums,target,index+1,current_value+nums[index]);
        int negative = helper(nums,target,index+1,current_value-nums[index]);
        return positive+negative;
    }
}
