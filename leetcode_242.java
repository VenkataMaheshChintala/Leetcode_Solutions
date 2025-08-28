import java.util.HashMap;

public class leetcode_242 {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int temp;
        for(int i=0;i<s.length();i++) {
            if(map1.containsKey(s.charAt(i))) {
                temp = map1.get(s.charAt(i));
                temp++;
                map1.put(s.charAt(i),temp);
            } else {
                map1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++) {
            if(map2.containsKey(t.charAt(i))) {
                temp = map2.get(t.charAt(i));
                temp++;
                map2.put(t.charAt(i),temp);
            } else {
                map2.put(t.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(map1.containsKey(ch) && map2.containsKey(ch)) {
                temp = map1.get(ch);
                if (temp != map2.get(ch)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
