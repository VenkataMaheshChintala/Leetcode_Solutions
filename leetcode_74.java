public class leetcode_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1) {
            for(int i=0;i<matrix[0].length;i++) {
                if(matrix[0][i] == target) return true;
            }
            return false;
        }
        for(int i=0;i<matrix.length-1;i++) {
            if(matrix[i][0] == target || matrix[i+1][0] == target) return true;
            if(matrix[i][0] < target && matrix[i+1][0] > target) {
                for(int j=0;j<matrix[i].length;j++) {
                    if(matrix[i][j] == target) return true;
                }
                return false;
            }
        }
        for(int i=0;i<matrix[matrix.length-1].length;i++) {
            if(matrix[matrix.length-1][i] == target) return true;
        }
        return false;
    }
}
