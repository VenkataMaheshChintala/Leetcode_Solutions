import java.util.ArrayList;
import java.util.List;

public class leetcode_345 {
    public String reverseVowels(String s) {
        StringBuffer original = new StringBuffer(s);
        StringBuffer vowels = new StringBuffer();
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        for(int i=0;i<original.length();i++) {
            if(list.contains(s.charAt(i))) {
                vowels.append(s.charAt(i));
            }
        }
        vowels.reverse();
        int j = 0;
        for(int i=0;i<original.length();i++) {
            if(list.contains(original.charAt(i))) {
                original.setCharAt(i,vowels.charAt(j));
                j++;
            }
        }
        return original.toString();
    }
}
