import java.util.Arrays;

public class leetcode_286 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int nzero = 0,prod_all=1,prod_ez=1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) nzero++;
            prod_all *= nums[i];
            if(nums[i]!=0) prod_ez *= nums[i];
        }
        if(nzero > 1) {
            Arrays.fill(ans,0);
        } else if (nzero == 0) {
            for(int i=0;i<nums.length;i++) {
                ans[i] = prod_all/nums[i];
            }
        } else {
            for(int i=0;i<nums.length;i++) {
                if(nums[i] != 0) ans[i] = 0;
                else ans[i] = prod_ez;
            }
        }
        return ans;
    }
}
