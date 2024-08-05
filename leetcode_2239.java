public class leetcode_2239 {
    public static void main(String[] args) {
        int[] nums = {-4,-2,1,4,8};
        System.out.println(findClosestNumber(nums));
    }
    public static int findClosestNumber(int[] nums) {
        int dist1=Integer.MAX_VALUE,ans = dist1,dist,temp=0;
        for(int i=0;i<nums.length;i++) {
            dist = Math.abs(nums[i]);
            if (dist == dist1) {
                if(i!=0) ans = Math.max(nums[i],nums[temp]);
                else ans = nums[0];
            }
            if (dist<dist1) {
                ans = nums[i];
                dist1 = dist;
                temp = i;
            }
        }
        return ans;
    }
}
