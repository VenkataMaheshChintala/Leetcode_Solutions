import java.util.Arrays;

public class leetcode_807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] north = new int[grid.length];
        for(int i=0;i<grid.length;i++) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int j=0;j<grid.length;j++) {
                if(grid[j][i] > max) {
                    index = j;
                    max = grid[j][i];
                }
            }
            north[i] = max;
        }
        int[] east = new int[grid.length];
        for(int i=0;i<grid.length;i++) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for(int j=0;j<grid.length;j++) {
                if(grid[i][j] > max) {
                    index = j;
                    max = grid[i][j];
                }
            }
            east[i] = max;
        }
        System.out.println(Arrays.toString(north));
        System.out.println(Arrays.toString(east));
        int ans = 0;
        for(int i=0;i<grid.length;i++) {
            int maxEast = east[i];
            for(int j=0;j<grid.length;j++) {
                int currentHeight = grid[i][j];
                int possibleHeight = Math.min(maxEast,north[j]);
                ans += (possibleHeight - currentHeight);
            }
        }
        return ans;
    }
}
