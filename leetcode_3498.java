public class leetcode_3498 {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++) {
            int ind = s.charAt(i);
            ind -= 97;
            ind = Math.abs(ind - 26);
            ans += (ind * (i+1));
        }
        return ans;
    }
}
