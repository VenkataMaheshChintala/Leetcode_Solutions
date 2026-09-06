public class leetcode_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for(int i=0;i<stones.length();i++) {
            int ind = jewels.indexOf(stones.charAt(i));
            if(ind != -1) {
                ans++;
            }
        }
        return ans;
    }
}
