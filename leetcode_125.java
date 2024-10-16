public class leetcode_125 {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String f,e;
        for (int i = 0 ; i < s.length() ; i++) {
            int ascii = (int) s.charAt(i);
            if ((ascii < 65 || ascii > 90) && (ascii < 97 || ascii > 122) && (ascii<48 || ascii>57)) {
                if (i-1 == 0) {
                    f = s.substring(0,1);
                } else {
                    f = s.substring(0,i);
                }
                e = s.substring(i+1,s.length());
                s = f + e;
                i--;
            }
        }
        s = s.toLowerCase();
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return temp.equals(s);
    }
}
