public class leetcode_326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }
    public static boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n==3) {
            return true;
        } else if (n<=0) {
            return false;
        } else {
            if(n%3 == 0) {
                return isPowerOfThree(n / 3);
            } else {
                return false;
            }
        }
    }
}
