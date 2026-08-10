public class leetcode_3345 {
    public int prod(int n) {
        int ans = 1;
        while(n>0) {
            ans *= (n%10);
            n/=10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        int num = n;
        while((prod(num)%t)!=0) {
            num++;
        }
        return num;
    }
}
