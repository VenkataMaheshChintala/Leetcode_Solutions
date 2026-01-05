public class leetcode_2414 {
    public int longestContinuousSubstring(String s) {
        int right = 0;
        int left = 0;
        int max = 0;
        while(right!=s.length()-1) {
            if(((int) s.charAt(right)) == ((int) s.charAt(right+1)-1)) {
                right++;
                if(right-left > max) max = right-left;
            } else {
                left = right+1;
                right++;
            }
        }
        return max+1;
    }
}
