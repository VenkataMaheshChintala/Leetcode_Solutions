import java.util.Arrays;

public class leetcode_2574 {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
    public static int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int lsum=0,rsum=0;
        for(int i=0;i<answer.length;i++) {
            lsum = sum(nums,0,i-1);
            rsum = sum(nums,i+1,nums.length-1);
            answer[i] = Math.abs(lsum - rsum);
        }
        return answer;
    }
    public static int sum(int[] nums,int start,int end) {
        int sum = 0;
        if(start==0 && end<0) return 0;
        for(int i=start;i<=end;i++) {
            sum += nums[i];
        }
        return sum;
    }
}
