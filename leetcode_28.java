public class leetcode_28 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        int l_needle = needle.length();
        int l_haystack = haystack.length();
        String substr;
        boolean ans;
        for(int i = 0 ; i < (l_haystack - l_needle) + 1;i++) {
            substr = haystack.substring(i,(i + l_needle));
            ans = isStr(substr , needle);
            if(ans) {
                return i;
            }
        }
        return -1;
    }
    public static boolean isStr(String mainString,String needle) {
        int count = 0;
        for(int i = 0;i<mainString.length();i++) {
            if(mainString.charAt(i) == needle.charAt(i)) {
                count ++;
            }
        }
        return count == needle.length();
    }
}
