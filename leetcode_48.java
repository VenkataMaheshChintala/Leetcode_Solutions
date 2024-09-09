public class leetcode_48 {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int size = matrix.length;
        int temp;
        for(int i=0;i<size;i++) {
            for(int j=i;j<size;j++) {
                if(i==j) continue;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++) {
            for(int j=0,k=size-1;j<k;j++,k--) {
                temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for(int i=0;i< matrix.length;i++) {
            for(int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }

}