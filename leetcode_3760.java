import java.util.ArrayList;
import java.util.List;

public class leetcode_3760 {
    public int maxDistinct(String s) {
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            if(!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
            }
        }
        return list.size();
    }
}
