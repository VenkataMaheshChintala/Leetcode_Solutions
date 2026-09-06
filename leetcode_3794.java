public class leetcode_3794 {
    public String reversePrefix(String s, int k) {
        StringBuilder ans = new StringBuilder();
        String sub = s.substring(0,k);
        String reversed = new StringBuilder(sub).reverse().toString();
        ans.append(reversed);
        ans.append(s.substring(k));
        return ans.toString();
    }
}
