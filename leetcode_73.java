import java.util.ArrayList;
import java.util.Arrays;

public class leetcode_73 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        //{0,1,2,0},{3,4,5,2},{1,3,1,5}
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> clist = new ArrayList<>();
        ArrayList<Integer> rlist = new ArrayList<>();
        int[][] anothermatrix = cloneMatrix(matrix);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j] == 0 && anothermatrix[i][j]==0) {
                    rlist.add(j);
                }
            }
            if(!rlist.isEmpty()) {
                Arrays.fill(matrix[i],0);
                for(int k=0;k<rlist.size();k++) {
                    if(clist.contains(rlist.get(k))) continue;
                    for (int j = 0; j < matrix.length; j++) {
                        matrix[j][rlist.get(k)] = 0;
                    }
                    clist.add(rlist.get(k));
                }
            }
            rlist.clear();
        }
        for(int i=0;i<matrix.length;i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public static int[][] cloneMatrix(int[][] original) {
        if (original == null) return null;

        int[][] copy = new int[original.length][];

        for (int i = 0; i < original.length; i++) {
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }

        return copy;
    }
}
