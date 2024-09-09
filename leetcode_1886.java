public class leetcode_1886 {
    public static void main(String[] args) {
        int[][] mat = {{1,1},{0,1}};
        int[][] target = {{1,1},{1,0}};
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat,int[][] target) {
        if(isEquals(mat,target)) return true;
        int temp = 0;
        while(temp!= 4) {
            mat = rotate(mat);
            if(isEquals(mat,target)) return true;
            temp ++;
        }
        return false;
    }
    public static int[][] rotate(int[][] matrix) {
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
        return matrix;
    }
    public static boolean isEquals(int[][] mat,int[][] target) {
        int count=0;
        if(mat.length!=target.length) return false;
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j< mat.length;j++) {
                if(mat[i][j]==target[i][j]) count++;
            }
        }
        if(count==(mat.length* mat.length)) return true;
        else return false;
    }
}
