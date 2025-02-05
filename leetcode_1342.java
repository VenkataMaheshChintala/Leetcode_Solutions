public class leetcode_1342 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
    public static int numberOfSteps(int num) {
        return rec(num,0);
    }
    public static int rec(int n,int count) {
        if(n==0) {
            return count;
        }
        if(n%2 == 0) {
            return rec(n/2,count+1);
        } else {
            return rec(n-1,count+1);
        }
    }
}
