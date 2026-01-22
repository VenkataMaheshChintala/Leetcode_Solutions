public class leetcode_238 {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        int nz = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) {
                arr[index] = nums[i];
                index++;
            }
        }
        for(int i=index;i<nums.length;i++) {
            arr[i] = 0;
        }
        for(int i=0;i<nums.length;i++) {
            nums[i] = arr[i];
        }
    }
}
