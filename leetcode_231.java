public class leetcode_231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(56));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n==2) {
            return true;
        } else if (n<=0) {
            return false;
        } else {
            if(n%2 == 0) {
                return isPowerOfTwo(n / 2);
            } else {
                return false;
            }
        }
    }
}
