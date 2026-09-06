import java.util.ArrayList;
import java.util.List;

public class leetcode_2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++) {
            String str = words[i];
            int ind = str.indexOf(x);
            if(ind != -1) {
                ans.add(i);
            }
        }
        return ans;
    }
}
