import java.util.Arrays;

public class leetcode_1365 {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int temp;
        int[] ans = new int[nums.length];
        for(int i=0;i< nums.length;i++) {
            temp = IsSmall(nums[i],nums);
            ans[i] = temp;
        }
        return ans;
    }
    static int IsSmall(int n,int[] arr) {
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            if(n > arr[i] && n != arr[i]) count++;
        }
        return count;
    }
}
