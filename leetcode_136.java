public class leetcode_136 {
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,4,5,4,5,3,-1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        boolean res1,res2;
        for(int i=0;i<nums.length;i++) {
            res1 = search(nums,i+1,nums.length-1,nums[i]);
            res2 = search(nums,0,i-1,nums[i]);
            if(res1==false && res2==false) {
                return nums[i];
            }
        }
        return -1;
    }
    public static boolean search(int[] arr,int start,int end,int target) {
        for(int i=start;i<=end;i++) {
            if(arr[i]==target) return true;
        }
        return false;
    }
}
