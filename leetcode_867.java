public class leetcode_867 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        int result[][] = transpose(matrix);
        for(int i=0;i<result.length;i++) {
            for(int j=0;j<result[i].length;j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
    static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[col][row];
        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j<col;j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
