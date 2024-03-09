import java.util.Arrays;

public class leetcode_1480 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
