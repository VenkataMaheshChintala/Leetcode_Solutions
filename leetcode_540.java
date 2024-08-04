public class leetcode_540 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        while((end-start)>=1) {
            if(mid==0 && nums[mid]!=nums[mid+1]) return nums[mid];
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            if((mid%2)==0) {
                if(nums[mid] == nums[mid+1]) {
                    start = mid + 1;
                } else end = mid - 1;
            } else {
                if(nums[mid] == nums[mid-1]) {
                    start = mid + 1;
                } else end = mid - 1;
            }
            mid = (start + end)/2;
        }
        return nums[start];
    }
}
