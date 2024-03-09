import java.util.Arrays;

public class leetcode_1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int pos;
        for(int i=0;i<target.length;i++) {
            pos = index[i];
            if(pos<i) {
                Rearrange(pos,target);
            }
            target[pos] = nums[i];
        }
        return target;
    }
    static void Rearrange(int pos,int[] nums) {
        for(int i = nums.length-1;i>pos;i--) {
            nums[i] = nums[i-1];
        }
    }
}
