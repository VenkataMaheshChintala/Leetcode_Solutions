public class leetcode_3304 {
    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder("a");
        while(s.length() < k) {
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<s.length();i++) {
                temp.append(s.charAt(i));
                int ascii = s.charAt(i);
                ascii++;
                temp.append((char) ascii);
            }
            s = new StringBuilder(temp);
        }
        return s.charAt(k-1);
    }
}
