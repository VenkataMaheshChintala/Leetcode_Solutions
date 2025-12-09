import java.util.HashMap;

public class leetcode_1137 {
    public static HashMap<Integer,Integer> map = new HashMap<>();
    public void helper() {
        map.put(0,0);
		map.put(1,1);
		map.put(2,1);
    }
    public int tribonacci(int n) {
        helper();
        if(map.containsKey(n)) {
			int ans = map.get(n);
			return ans;
		}
		int ans = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
		map.put(n,ans);
		return ans;
    }
}
