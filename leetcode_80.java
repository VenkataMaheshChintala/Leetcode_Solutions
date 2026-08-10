public class leetcode_80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length <= 2) {
            return nums.length;
        }
        int ele,count,cidx;
        cidx = 0;
        for(int i=0;i<nums.length;) {
            ele = nums[i];
            count = 0;
            int j = i;
            while(j<nums.length && nums[j] == ele) {
                j++;
                count++;
            }
            if(count >= 2) {
                if(cidx < nums.length) {
                    nums[cidx] = ele;
                }
                if(cidx+1 < nums.length) {
                    nums[cidx+1] = ele;
                }
                cidx += 2;
            } else {
                nums[cidx] = ele;
                cidx++;
            }
            i = j;
        }
        return cidx;
    }
}