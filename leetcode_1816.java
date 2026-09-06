public class leetcode_1816 {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<k;i++) {
            ans.append(words[i]);
            ans.append(" ");
        }
        String a = ans.toString();
        a = a.substring(0,a.length()-1);
        return a;
    }
}
