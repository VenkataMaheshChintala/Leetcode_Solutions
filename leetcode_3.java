import java.util.ArrayList;
import java.util.List;

public class leetcode_3 {
    public static int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int maxlen = 0,length=0;
        List<Character> list = new ArrayList<>();
        while(right < s.length()) {
            if(!list.contains(s.charAt(right))) {
                list.add(s.charAt(right));
                right++;
                length = list.size();
            } else {
                if(maxlen < list.size()) {
                    maxlen = list.size();
                }
                list.removeFirst();
                left++;
            }
        }
        return Math.max(length, maxlen);
    }
    public static void main(String[] args) {
        String s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
