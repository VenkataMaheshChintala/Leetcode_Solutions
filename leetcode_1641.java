import java.util.Arrays;

public class leetcode_1641 {
    static char ch[] = {'a','e','i','o','u'};
    static int[][] dp;
    public int helperDP(int n,StringBuffer s, int index) {
        if(s.length() > n) return 0;
        if(s.length() == n) return 1;
        if(dp[s.length()][index] != -1) return dp[s.length()][index];
        else {
            int ans = 0;
            StringBuffer sb;
            for(int i=index;i<ch.length;i++) {
                sb = new StringBuffer(s);
                ans +=  helperDP(n,sb.append(ch[i]),i);
            }
            return dp[s.length()][index] = ans;
        }
    }
    public int countVowelStrings(int n) {
        dp = new int[n+1][5];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helperDP(n,new StringBuffer(""),0);
    }
}
