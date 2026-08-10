import java.util.Arrays;
import java.util.Collections;

public class leetcode_2545 {
    public int search(int[] arr,int ele) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
    public int[][] sortTheStudents(int[][] score, int k) {
        int[] kScore = new int[score.length];
        for(int i=0;i<score.length;i++) {
            kScore[i] = score[i][k];
        }
        int[] ks = new int[score.length];
        for(int i=0;i<score.length;i++) {
            ks[i] = score[i][k];
        }
        kScore = Arrays.stream(ks)
                                  .boxed()
                                  .sorted(Collections.reverseOrder())
                                  .mapToInt(Integer::intValue)
                                  .toArray();
        int[] kScoreMap = new int[score.length];
        for(int i=0;i<score.length;i++) {
            kScoreMap[i] = search(ks,kScore[i]);
        }
        int[][] ans = new int[score.length][score[0].length];
        for(int i=0;i<kScoreMap.length;i++) {
            int row = kScoreMap[i];
            int[] Row = score[row];
            for(int j=0;j<score[0].length;j++) {
                ans[i][j] = Row[j];
            }
        }
        return ans;
    }
}
