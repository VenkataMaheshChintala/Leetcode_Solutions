public class leetcode_1768 {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternatively(word1,word2));
    }
    public static String mergeAlternatively(String word1,String word2) {
        int pos1=0,pos2=0;
        String res = "",temp="";
        if(word1.length()>=word2.length()) {
            for(int i=1;i<=2*word2.length();i++) {
                if(i%2==0) {
                    res += word2.charAt(pos1);
                    pos1++;
                } else {
                    res += word1.charAt(pos2);
                    pos2++;
                }
            }
            for(int i=pos2;i<word1.length();i++) {
                temp += word1.charAt(i);
            }
            res = res + temp;
        } else {
            for(int i=1;i<=2*word1.length();i++) {
                if(i%2==0) {
                    res += word2.charAt(pos1);
                    pos1++;
                } else {
                    res += word1.charAt(pos2);
                    pos2++;
                }
            }
            for(int i=pos1;i<word2.length();i++) {
                temp+=word2.charAt(i);
            }
            res = res + temp;
        }
        return res;
    }
}
