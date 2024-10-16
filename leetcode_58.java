public class leetcode_58 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int space = -1;
        int count = 0;
        for (int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i) == ' ') {
                s = s.substring(0,i);
            } else {
                break;
            }
        }
        for (int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == ' ') {
                space = i;
            }
        }
        for (int i = space+1;i<s.length();i++) {
            count++;
        }
        return count;
    }
}

