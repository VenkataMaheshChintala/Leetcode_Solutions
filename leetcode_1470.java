import java.util.Arrays;

public class leetcode_1470 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] ans = shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j = n,x=0;
        for(int i=0;i<nums.length;i++) {
            if((i%2)==0 || i==0) {
                ans[i] = nums[x];
                x++;
            }
            else {
                ans[i] = nums[j];
                j++;
            }
        }
        return ans;
    }
}