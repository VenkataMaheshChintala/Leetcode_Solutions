import java.util.Arrays;

public class leetcode_1 {
    public static void main(String[] args) {
        int target = 6;
        int[] inp = {3,3};
        int[] result = twoSum(target,inp);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int target,int[] nums) {
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j = i+1;j<nums.length;j++) {
                if((nums[i]+nums[j])==target) {
                    result[0] = i;
                    result[1] = j;
                } else {
                    continue;
                }
            }
        }
        return result;
    }
}
