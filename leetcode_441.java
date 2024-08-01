public class leetcode_441 {
    public static void main(String[] args) {
        long n = 2147483647;
        System.out.println(arrangeCoins(n));
    }
    static long arrangeCoins(long n) {
        long i=0,sum=0;
        while(true) {
            sum += i;
            if(sum>n) {
                return i-1;
            }
            i++;
        }
    }
}
