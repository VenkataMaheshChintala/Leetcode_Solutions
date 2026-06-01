import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_2785 {
    public String sortVowels(String s) {
        StringBuffer original = new StringBuffer(s);
        StringBuilder vowels = new StringBuilder();
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
        char[] chars = new char[vowels.length()];
        vowels.getChars(0, vowels.length(), chars, 0);
        Arrays.sort(chars);
        int j = 0;
        for(int i=0;i<original.length();i++) {
            if(list.contains(original.charAt(i))) {
                original.setCharAt(i,chars[j]);
                j++;
            }
        }
        return original.toString();
    }
}
