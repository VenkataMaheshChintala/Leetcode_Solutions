import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode_149 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i< strs.length;i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(map.containsKey(key)) {
                List<String> temp = map.get(key);
                temp.add(strs[i]);
                map.put(key,temp);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(key,temp);
            }
        }
        return new ArrayList<>(map.values());
    }
}
