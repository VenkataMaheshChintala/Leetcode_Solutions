import java.util.ArrayList;
import java.util.List;

public class leetcode_54 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> result = spiralOrder(matrix);
        for(int i : result) {
            System.out.println(i);
        }
    }
    static List<Integer> spiralOrder(int[][] matrix) {
        int maxr = matrix.length-1, minr=0,maxc = matrix[0].length-1,minc=0,totcount = matrix.length*matrix[0].length;
        List<Integer> ans = new ArrayList<>(10);
        int count = 0;
        while(count<totcount) {
            for(int j=minc;j<=maxc;j++) {
                ans.add(matrix[minr][j]);
                count++;
            }
            minr++;
            if(count>=totcount) break;
            for(int i =minr;i<=maxr;i++) {
                ans.add(matrix[i][maxc]);

                count++;
            }
            maxc--;
            if(count>=totcount) break;
            for(int j=maxc;j>=minc;j--) {
                ans.add(matrix[maxr][j]);
                count++;
            }
            maxr--;
            if(count>=totcount) break;
            for(int i = maxr;i>=minr;i--) {
                ans.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }
        return ans;
    }
}
