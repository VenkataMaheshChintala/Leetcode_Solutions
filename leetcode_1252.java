public class leetcode_1252 {
    public static void main(String[] args) {
        int m=2,n=2;
        int[][] indices = {
                {1,1},
                {0,0}
        };
        int ans = oddCells(m,n,indices);
        System.out.println(ans);

    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        for(int i=0;i< indices.length;i++) {
            increment(indices[i],ans);
        }
        int count=0;
        for(int i=0;i<ans.length;i++) {
            for(int j=0;j<ans[i].length;j++) {
                if((ans[i][j]%2)!=0) count++;
            }
        }
        return count;
    }
    static void increment(int[] incr,int[][] ans) {
        int row = incr[0];
        int col = incr[1];
        for(int i=0;i<ans.length;i++) {
            for(int j=0;j<ans[i].length;j++) {
                if(i==row) ans[i][j]++;
                if(j==col) ans[i][j]++;
            }
        }
    }
}
