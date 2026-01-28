public class leetcode_2221 {
    public int triangularSum(int[] nums) {
        int endIndex = nums.length-1;
        while (endIndex >= 1) {
            for (int i = 0; i < endIndex; i++) {
                nums[i] = nums[i] + nums[i + 1];
                if(nums[i] >= 10) nums[i] = nums[i] % 10;
            }
            endIndex--;
        }
        return nums[0];
    }
}
