public class leetcode_342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
    }
    public static boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n==4) {
            return true;
        } else if (n<=0) {
            return false;
        } else {
            if(n%4 == 0) {
                return isPowerOfFour(n / 4);
            } else {
                return false;
            }
        }
    }
}
