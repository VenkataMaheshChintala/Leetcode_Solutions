import java.util.ArrayList;
import java.util.HashMap;

public class leetcode_205 {
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

    public static void main(String[] args) {
        String s = "add";
        String t = "egg";
        System.out.println(isIsomorphic(s,t));
    }
}
