public class leetcode_1662 {
    public static void main(String[] args) {
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1 = "";
        String ans2 = "";
        for(int i=0;i<word1.length;i++) {
            ans1 = ans1 + word1[i];
        }
        for(int i=0;i<word2.length;i++) {
            ans2 = ans2 + word2[i];
        }
        return ans1.equals(ans2);
    }
    
}
