public class leetcode_2108 {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int i=0;i<words.length;i++) {
            StringBuilder s = new StringBuilder(words[i]);
            if(s.reverse().toString().equals(words[i])) return words[i];
        }
        return ans;
    }
}
