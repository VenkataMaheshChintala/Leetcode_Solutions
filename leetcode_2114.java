public class leetcode_2114 {
    public int mostWordsFound(String[] sentences) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++) {
            String str = sentences[i];
            String[] arr = str.split(" ");
            ans = Math.max(ans,arr.length);
        }
        return ans;
    }
}
