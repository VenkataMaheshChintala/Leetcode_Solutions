public class leetcode_2390 {
    public String removeStars(String s) {
        StringBuffer ans = new StringBuffer(s);
        int j = 0;
        while (ans.charAt(j) == '*') {
            ans.deleteCharAt(j);
            if(ans.isEmpty()) return "";
        }
        for(int i=0;i<ans.length();i++) {
            if(ans.charAt(i) == '*') {
                ans.deleteCharAt(i);
                ans.deleteCharAt(i-1);
                i-=2;
            }
        }
        return ans.toString();
    }
}
