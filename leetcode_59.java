public class leetcode_59 {
    public static void main(String[] args) {
        int n = 3;
        int[][] result = generateMatrix(n);
        for(int i=0;i<result.length;i++) {
            for(int j=0;j<result[i].length;j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int maxr = matrix.length-1, minr=0,maxc = matrix[0].length-1,minc=0,totcount = n*n;
        int count = 1;
        while(count<=totcount) {
            for(int j=minc;j<=maxc;j++) {
                matrix[minr][j] = count;
                count++;
            }
            minr++;
            if(count>totcount) break;
            for(int i =minr;i<=maxr;i++) {
                matrix[i][maxc] = count;
                count++;
            }
            maxc--;
            if(count>totcount) break;
            for(int j=maxc;j>=minc;j--) {
                matrix[maxr][j] = count;
                count++;
            }
            maxr--;
            if(count>totcount) break;
            for(int i = maxr;i>=minr;i--) {
                matrix[i][minc] = count;
                count++;
            }
            minc++;
        }
        return matrix;
    }
}
