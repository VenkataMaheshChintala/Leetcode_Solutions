public class leetcode_724 {
    public int pivotIndex(int[] nums) {
        int lsum = 0;
        int rsum = 0;
        for(int i=1;i<nums.length;i++) {
            rsum += nums[i];
        }
        if(lsum == rsum) return 0;
        else lsum += nums[0];
        for(int i=1;i<nums.length;i++) { 
            if(i == nums.length - 1) {
                rsum = 0;
                if(rsum == lsum) {
                    return nums.length-1;
                } else {
                    return -1;
                }
            }
            rsum -= nums[i];
            if(lsum == rsum) {
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
}
