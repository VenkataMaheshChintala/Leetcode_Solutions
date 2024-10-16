public class leetcode_1351 {
    public static void main(String[] args) {
        int matrix[][] = {
                {5,1,0},
                {-5,-5,-5}
        };
        System.out.println(search(matrix));
    }
    static int search(int[][] matrix) {
        int row = 0,nrow = matrix.length;
        int col = matrix[0].length - 1;
        int ncol = matrix[0].length;
        int ans = 0;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] < 0) {
                ans += nrow;
                ncol--;
                col--;
            } else {
                row ++;
                nrow--;
            }
        }
        return ans;
    }
}
