public class leetcode_3190 {
    public static void main(String[] args) {
        int[] nums = {3,6,9};
        System.out.println(MinimumOperations(nums));
    }
    public static int MinimumOperations(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%3 ==0) count+=0;
            if((nums[i]-1)%3 ==0 || (nums[i]+1)%3 ==0) count+=1;
        }
        return count;
    }
}
