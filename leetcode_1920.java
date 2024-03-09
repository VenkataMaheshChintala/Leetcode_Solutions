import java.util.Arrays;

public class leetcode_1920 {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int [] nums1 = buildArray(nums);
        System.out.println(Arrays.toString(nums1));
    }
    static int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] nums2 = new int[length];
        for(int i=0;i<nums2.length;i++) {
            nums2[i] = nums[nums[i]];
        }
        return nums2;
    }
}
