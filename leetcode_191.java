public class leetcode_191 {
    public int hammingWeight(int n) {
        int a;
        int count = 0;
        while(true) {
            a = n%2;
            if(a == 1) count++;
            if(n == 0 || n == 1) break;
            n = (int) n/2;
        }
        return count;
    }
}
