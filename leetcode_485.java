public class leetcode_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int currentCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
            } else {
                maxOnes = Math.max(maxOnes, currentCount);
                currentCount = 0;
            }
        }
        return Math.max(maxOnes, currentCount);
    }
}
