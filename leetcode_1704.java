public class leetcode_1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }
    public static boolean halvesAreAlike(String s) {
        String left = s.substring(0,s.length()/2);
        String right = s.substring(s.length()/2,s.length());
        int lcount=0;
        for(int i=0;i<left.length();i++) {
            if(left.charAt(i) == 'a' || left.charAt(i) == 'e' || left.charAt(i) == 'i' || left.charAt(i) == 'o' || left.charAt(i) == 'u' || left.charAt(i) == 'A' || left.charAt(i) == 'E' || left.charAt(i) == 'I' || left.charAt(i) == 'O' || left.charAt(i) == 'U') {
                lcount++;
            }
        }
        int rcount = 0;
        for(int i=0;i<right.length();i++) {
            if(right.charAt(i) == 'a' || right.charAt(i) == 'e' || right.charAt(i) == 'i' || right.charAt(i) == 'o' || right.charAt(i) == 'u' || right.charAt(i) == 'A' || right.charAt(i) == 'E' || right.charAt(i) == 'I' || right.charAt(i) == 'O' || right.charAt(i) == 'U') {
                rcount++;
            }
        }
        return lcount==rcount;
    }
}
