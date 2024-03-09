public class leetcode_1295 {
    public static void main(String[] args) {
        int count=0,ans=0;
        int[] nums = {555 ,901 , 482, 1771};
        for(int i=0;i<nums.length;i++) {
            count = 0;
            while(nums[i]!=0) {
                nums[i] /= 10;
                count++;
            }
            if((count%2)==0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
