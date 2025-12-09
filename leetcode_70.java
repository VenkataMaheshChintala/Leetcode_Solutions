import java.util.HashMap;

public class leetcode_70 {
    public HashMap<Integer,Integer> map = new HashMap<>();
    public void helper() {
        map.put(1,1);
		map.put(2,2);
		map.put(3,3);
    }
    public int climbStairs(int n) {
        helper();
        if(map.containsKey(n)) {
            int ans = map.get(n);
            return ans;
        }
        int ans = climbStairs(n-1) + climbStairs(n-2);
        map.put(n,ans);
        return ans;
    }
}
