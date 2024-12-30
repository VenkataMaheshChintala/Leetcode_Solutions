import java.util.Arrays;
public class leetcode_260 {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
    public static int[] singleNumber(int[] nums) {
        int[] result = {0,0};
        boolean res1,res2;
        int j=0;
        for(int i=0;i<nums.length;i++) {
            res1 = search(nums,i+1,nums.length-1,nums[i]);
            res2 = search(nums,0,i-1,nums[i]);
            if(res1==false && res2==false) {
                result[j] = nums[i];
                j++;
            }
        }
        return result;
    }
    public static boolean search(int[] arr,int start,int end,int target) {
        for(int i=start;i<=end;i++) {
            if(arr[i]==target) return true;
        }
        return false;
    }
}
