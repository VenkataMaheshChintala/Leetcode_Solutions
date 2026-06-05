import java.util.HashMap;

public class leetcode_397 {
    HashMap<Long, Integer> map = new HashMap<>();
    public int helper(long n) {
        if (n == 1) return 0;
        if (map.containsKey(n)) return map.get(n);
        int ans;
        if (n % 2 == 0) {
            ans = 1 + helper(n / 2);
        } else {
            ans = 1 + Math.min(helper(n + 1), helper(n - 1));
        }
        map.put(n, ans);
        return ans;
    }
    public int integerReplacement(int n) {
        return helper((long)n);
    }
}
