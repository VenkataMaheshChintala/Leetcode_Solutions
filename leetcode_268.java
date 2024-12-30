public class leetcode_268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        boolean res;
        for(int i=0;i<nums.length+1;i++) {
            res = search(nums,i);
            if(!res) {
                return i;
            }
        }
        return -1;
    }
    public static boolean search(int[] nums,int j) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == j) {
                return true;
            }
        }
        return false;
    }
}
