import java.util.Arrays;

public class leetcode_72 {
    public int[][] dp;
    public int helper(StringBuilder word1,StringBuilder word2,int index1,int index2) {
        if(index1 < 0) return index2+1;
        if(index2 < 0) return index1+1;
        if(dp[index1][index2] != -1) return dp[index1][index2];
        if(word1.charAt(index1) == word2.charAt(index2)) {
            return dp[index1][index2] = helper(word1,word2,index1-1,index2-1);
        } else {
            return dp[index1][index2] = 1+Math.min(
                    // replacing
                    helper(word1,word2,index1-1,index2-1),
                    Math.min(
                            // deleting
                            helper(word1,word2,index1-1,index2),
                            // inserting
                            helper(word1,word2,index1,index2-1)
                    )
            );
        }
    }
    public int minDistance(String word1, String word2) {
        StringBuilder w1 = new StringBuilder(word1);
        StringBuilder w2 = new StringBuilder(word2);
        dp = new int[word1.length()][word2.length()];
        for(int i=0;i<dp.length;i++) {
            Arrays.fill(dp[i],-1);
        }
        return helper(w1,w2,word1.length()-1,word2.length()-1);
    }
}
