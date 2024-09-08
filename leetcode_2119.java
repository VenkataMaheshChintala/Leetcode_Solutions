public class leetcode_2119 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(isSameAfterReversals(x));
    }
    public static boolean isSameAfterReversals(int x) {
        int reversed1 = reve(x);
        int reversed2 = reve(reversed1);
        if(reversed2==x) return true;
        else return false;
    }
    public static int reve(int x) {
        int rev = 0,ld=0;
        while (x != 0) {
            rev *= 10;
            ld = x % 10;
            rev += ld;
            x = x / 10;
        }
        return rev;
    }
}