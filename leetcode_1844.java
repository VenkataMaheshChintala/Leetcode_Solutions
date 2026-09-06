public class leetcode_1844 {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if((i%2)!=0) {
                int ind = s.charAt(i-1);
                ind += s.charAt(i) - '0';
                ans.append((char) ind);
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
