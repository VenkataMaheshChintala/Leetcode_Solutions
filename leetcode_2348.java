public class leetcode_2348 {
    public long zeroFilledSubarray(int[] nums) {
        long sum = 0;
        int start = -1;
        int end = -1;
        long n = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0 && start!=-1) {
                end++;
            } else if(nums[i] ==0 && start==-1) {
                start=i;
                end = i;
            } else {
                if(start!=-1 && end!=-1) {
                    n = (end-start)+1;
                    sum += (long) ((n*(n+1))/2);
                }
                start = -1;
                end = -1;
            }
        }
        if(start!=-1 && end!=-1) {
            n = (end-start)+1;
            sum += (long) ((n*(n+1))/2);
        }
        return sum;
    }
}
