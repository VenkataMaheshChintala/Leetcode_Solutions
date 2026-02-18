import java.util.HashMap;

public class leetcode_567 {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        HashMap<Character,Integer> targetMap = new HashMap<>();
        HashMap<Character,Integer> currentMap = new HashMap<>();
        int temp;
        for(int i=0;i<s1.length();i++) {
            if(targetMap.containsKey(s1.charAt(i))) {
                temp = targetMap.get(s1.charAt(i));
                temp++;
                targetMap.put(s1.charAt(i),temp);
            } else {
                targetMap.put(s1.charAt(i),1);
            }
        }
        for(int i=0;i<s1.length();i++) {
            if(currentMap.containsKey(s2.charAt(i))) {
                temp = currentMap.get(s2.charAt(i));
                temp++;
                currentMap.put(s2.charAt(i),temp);
            } else {
                currentMap.put(s2.charAt(i),1);
            }
        }
        if(currentMap.equals(targetMap)) return true;
        for(int i=1;i<=s2.length()-s1.length();i++) {
            temp = currentMap.get(s2.charAt(i-1));
            temp--;
            if(temp!=0) {
                currentMap.put(s2.charAt(i-1),temp);
            } else {
                currentMap.remove(s2.charAt(i-1));
            }
            if(currentMap.containsKey(s2.charAt(i+s1.length()-1))) {
                temp = currentMap.get(s2.charAt(i+s1.length()-1));
                temp++;
                currentMap.put(s2.charAt(i+s1.length()-1),temp);
            } else {
                currentMap.put(s2.charAt(i+s1.length()-1),1);
            }
            if(currentMap.equals(targetMap)) return true;
        }
        return false;
    }
}
