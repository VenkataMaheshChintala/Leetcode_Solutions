import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_438 {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        HashMap<Character,Integer> targetMap = new HashMap<>();
        HashMap<Character,Integer> currentMap = new HashMap<>();
        int temp;
        for(int i=0;i<p.length();i++) {
            if(targetMap.containsKey(p.charAt(i))) {
                temp = targetMap.get(p.charAt(i));
                temp++;
                targetMap.put(p.charAt(i),temp);
            } else {
                targetMap.put(p.charAt(i),1);
            }
        }
        for(int i=0;i<p.length();i++) {
            if(currentMap.containsKey(s.charAt(i))) {
                temp = currentMap.get(s.charAt(i));
                temp++;
                currentMap.put(s.charAt(i),temp);
            } else {
                currentMap.put(s.charAt(i),1);
            }
        }
        if(currentMap.equals(targetMap)) {
            list.add(0);
        }
        for(int i=1;i<=s.length()-p.length();i++) {
            temp = currentMap.get(s.charAt(i-1));
            temp--;
            if(temp != 0) {
                currentMap.put(s.charAt(i-1),temp);
            } else {
                currentMap.remove(s.charAt(i-1));
            }
            if(currentMap.containsKey(s.charAt(i+p.length()-1))) {
                temp = currentMap.get(s.charAt(i+p.length()-1));
                temp++;
                currentMap.put(s.charAt(i+p.length()-1),temp);
            } else {
                currentMap.put(s.charAt(i+p.length()-1),1);
            }
            if(currentMap.equals(targetMap)) {
                list.add(i);
            }
        }
        return list;
    }
}
