public class leetcode_3838 {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.length;i++) {
            String str = words[i];
            int map = 0;
            for(int j=0;j<str.length();j++) {
                int a = str.charAt(j);
                map += weights[a-97];
            }
            map %= 26;
            map = Math.abs(26-map)+96;
            ans.append((char) map);
        }
        return ans.toString();
    }
}
