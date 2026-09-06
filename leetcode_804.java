import java.util.HashSet;

public class leetcode_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++) {
            String str = words[i];
            StringBuilder s = new StringBuilder();
            for(int j=0;j<str.length();j++) {
                int x = str.charAt(j);
                s.append(morse[x-97]);
            }
            set.add(s.toString());
        }
        return set.size();
    }
}
