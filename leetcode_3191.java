public class leetcode_3191 {
    public int minOperations(int[] nums) {
        int count = 0;
        for(int i=0;i<=nums.length-3;i++) {
            if(nums[i]==0) {
                count++;
                nums[i]=1;
                if(nums[i+1]==0) {
                    nums[i+1]=1;
                } else nums[i+1] = 0;
                if(nums[i+2]==0) {
                    nums[i+2]=1;
                } else nums[i+2] = 0;
            }
        }
        boolean ans=true;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) ans=false;
        }
        if(!ans) return -1;
        else return count;
    }
}
