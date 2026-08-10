import java.util.Arrays;

public class leetcode_2482 {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] onesRow = new int[grid.length];
        int[] zerosRow = new int[grid.length];
        int[] onesCol = new int[grid[0].length];
        int[] zerosCol = new int[grid[0].length];
        for(int i=0;i<grid.length;i++) {
            int ones=0,zeros=0;
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 0) zeros++;
                else ones++;
            }
            onesRow[i] = ones;
            zerosRow[i] = zeros;
        }
        int j=0;
        for(int i=0;i<grid[0].length;i++) {
            int ones=0,zeros=0;
            for(j=0;j<grid.length;j++) {
                if(grid[j][i] == 0) zeros++;
                else ones++;
            }
            onesCol[i] = ones;
            zerosCol[i] = zeros;
        }
        System.out.println(Arrays.toString(onesRow));
        System.out.println(Arrays.toString(zerosRow));
        System.out.println(Arrays.toString(onesCol));
        System.out.println(Arrays.toString(zerosCol));
        int[][] ans = new int[grid.length][grid[0].length];
        for(int i=0;i<ans.length;i++) {
            for(j=0;j<ans[0].length;j++) {
                ans[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];
            }
        }
        return ans;
    }
}
