import java.util.ArrayList;
import java.util.List;

public class leetcode_151 {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        int startIndex = -1;
        int endIndex = -1;
        for(int i=0;i<s.length();i++) {
            if(' ' == s.charAt(i)) {
                if(startIndex != -1) {
                    endIndex = i;
                    list.add(s.substring(startIndex, endIndex));
                    startIndex = -1;
                }
            } else {
                if(startIndex == -1) {
                    startIndex = i;
                }
            }
        }
        if(s.charAt(s.length()-1) != ' ' && startIndex != -1) {
            list.add(s.substring(startIndex));
        }
        StringBuilder str = new StringBuilder();
        for(int i=list.size()-1;i>=0;i--) {
            str.append(list.get(i) + " ");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}
