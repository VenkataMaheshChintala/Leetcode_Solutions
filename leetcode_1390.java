public class leetcode_1390 {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += findDivisors(nums[i]);
        }
        return sum;
    }
    public int findDivisors(int n) {
        int count = 0;
        int sum = 0;
        for(int i=1;i<=(n/2);i++) {
            if((n%i) == 0) {
                count++;
                sum += i;
            }
            if(count>4) return 0;
        }
        if(count == 3) return sum+n;
        return 0;
    }
}
