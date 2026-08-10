public class leetcode_3857 {
    public int helper(int n,int count) {
        if(n==1) return count;
        return helper(n-1,count+n-1);
    }
    public int minCost(int n) {
        return helper(n,0);
    }
}
