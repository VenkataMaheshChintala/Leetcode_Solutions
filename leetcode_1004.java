public class leetcode_1004 {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,ans=0,temp=k,count=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 1) {
                right++;
                count++;
            } else {
                if(temp!=0) {
                    temp--;
                    right++;
                    count++;
                } else {
                    ans = Math.max(ans,count);
                    while (nums[left] != 0) {
                        count--;
                        left++;
                    }
                    left++;
                    right++;
                }
            }
        }
        ans = Math.max(ans,(right-left));
        return ans;
    }
}
