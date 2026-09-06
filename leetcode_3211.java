import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode_3211 {
    public HashSet<String> set;
    public void helper(StringBuffer current,int rem) {
        if(rem == 0) {
            set.add(current.toString());
            return;
        }
        if(current.charAt(current.length()-1) == '0') {
            current.append("1");
            helper(new StringBuffer(current),rem-1);
        } else {
            current.append("0");
            helper(new StringBuffer(current),rem-1);
            current.deleteCharAt(current.length()-1);
            current.append("1");
            helper(new StringBuffer(current),rem-1);
        }
    }
    public List<String> validStrings(int n) {
        set = new HashSet<>();
        helper(new StringBuffer("0"),n-1);
        helper(new StringBuffer("1"),n-1);
        List<String> list = new ArrayList<>(set);
        return list;
    }
}
