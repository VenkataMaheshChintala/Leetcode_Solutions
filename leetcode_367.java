public class leetcode_367 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        double temp = Math.pow(num,0.5);
        int temp1 = (int) temp;
        if (Math.pow(temp1,2)==num) {
            return true;
        } else {
            return false;
        }
    }
}
