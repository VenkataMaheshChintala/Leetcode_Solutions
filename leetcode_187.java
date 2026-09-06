import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        if(s.length() < 10) return new ArrayList<>();
        else {
            for (int i = 0; i <= s.length() - 10; i++) {
                String sub = s.substring(i, i + 10);
                if (!seen.add(sub)) {
                    repeated.add(sub);
                }
            }
        }
        return new ArrayList<>(repeated);
    }
}
