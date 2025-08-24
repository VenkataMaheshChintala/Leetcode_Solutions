import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_890 {
    public static boolean isIsomorphic(String s, String t) {
        boolean ans = true;
        HashMap<Character,Character> hmap = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            if(hmap.containsKey(s.charAt(i))) {
                if(t.charAt(i) == hmap.get(s.charAt(i))) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if(!list.contains(t.charAt(i))) {
                    hmap.put(s.charAt(i),t.charAt(i));
                    list.add(t.charAt(i));
                } else {
                    return false;
                }
            }
        }
        return ans;
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        boolean ans = true;
        for(int i=0;i<words.length;i++) {
            ans = isIsomorphic(words[i],pattern);
            if(ans) {
                list.add(words[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"a","b","c"};
        String pattern = "a";
        List<String> list = findAndReplacePattern(words,pattern);
        for (String s : list) {
            System.out.println(s);
        }
    }

}
