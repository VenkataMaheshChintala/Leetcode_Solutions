public class leetcode_1732 {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }
    static int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<gain.length;i++) {
            sum += gain[i];
            if(sum > max) max = sum;
        }
        if(max<0) return 0;
        return max;
    }
}
