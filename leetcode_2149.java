import java.util.Arrays;

public class leetcode_2149 {

    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int[] positive = new int[nums.length/2];
        int[] negative = new int[nums.length/2];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 0) {
                positive[j] = nums[i];
                j++;
            }
            if(nums[i] < 0) {
                negative[k] = nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i=0;i<nums.length;i++) {
            if((i%2) == 0) {
                ans[i] = positive[j];
                j++;
            } else {
                ans[i] = negative[k];
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
