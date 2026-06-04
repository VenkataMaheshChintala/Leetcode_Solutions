import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_91 {
    List<String> list;
    HashMap<String,Integer> map;
    public int helper(String unprocessed) {
        if(map.containsKey(unprocessed)) return map.get(unprocessed);
        if(unprocessed.isEmpty()) return 1;
        String one = new String(unprocessed.substring(0,1));
        if(!(list.contains(one))) {
            map.put(unprocessed,0);
            return 0;
        }
        if(unprocessed.length() >= 2) {
            String two = new String(unprocessed.substring(0, 2));
            if(list.contains(one) && list.contains(two)) {
                int ans = helper(new String(unprocessed.substring(1))) + helper(new String(unprocessed.substring(2)));
                map.put(unprocessed,ans);
                return ans;
            }
            if(list.contains(one)) {
                int ans = helper(new String(unprocessed.substring(1)));
                map.put(unprocessed,ans);
                return ans;
            } else {
                map.put(unprocessed,0);
                return 0;
            }
        } else {
            int ans =  helper(new String(unprocessed.substring(1)));
            map.put(unprocessed,ans);
            return ans;
        }
    }
    public int numDecodings(String s) {
        list = new ArrayList<>();
        for(int i=1;i<=26;i++) {
            list.add(String.valueOf(i));
        }
        map = new HashMap<>();
        return helper(s);
    }
}
