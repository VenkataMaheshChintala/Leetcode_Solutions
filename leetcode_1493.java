public class leetcode_1493 {
    public int longestSubarray(int[] nums) {
        int count = 0,ans = 0,prev_count = 0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                if(!flag) {
                    flag = true;
                    prev_count = count;
                } else {
                    ans = Math.max(ans,count);
                    count -= prev_count;
                    prev_count = count;
                }
            } else {
                count++;
            }
        }
        if(!flag) {
            return nums.length-1;
        }
        ans = Math.max(ans,count);
        return ans;
    }
}
