import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_3541 {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> v = new HashMap<>();
        HashMap<Character,Integer> c = new HashMap<>();
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        for(int i=0;i<s.length();i++) {
            if(list.contains(s.charAt(i))) {
                if(v.containsKey(s.charAt(i))) {
                    int a = v.get(s.charAt(i));
                    a++;
                    v.put(s.charAt(i),a);
                } else {
                    v.put(s.charAt(i),1);
                }
            } else {
                if(c.containsKey(s.charAt(i))) {
                    int a = c.get(s.charAt(i));
                    a++;
                    c.put(s.charAt(i),a);
                } else {
                    c.put(s.charAt(i),1);
                }
            }
        }
        List<Integer> vals = new ArrayList<>(v.values());
        int a = 0;
        for(int i=0;i<vals.size();i++) {
            a = Math.max(a,vals.get(i));
        }
        int b = 0;
        vals = new ArrayList<>(c.values());
        for(int i=0;i<vals.size();i++) {
            b = Math.max(b,vals.get(i));
        }
        return a+b;
    }
}
