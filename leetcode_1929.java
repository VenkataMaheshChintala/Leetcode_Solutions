import java.util.Arrays;

public class leetcode_1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] nums2 = getConcatenation(nums);
        System.out.println(Arrays.toString(nums2));
    }
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int i = 0;
        for(i=0;i<nums.length;i++) {
            ans[i] = nums[i];
        }
        int x = i;
        i=0;
        for(int j=x;j<ans.length;j++) {
            ans[j] = ans[i];
            i++;
        }
        return ans;
    }
}