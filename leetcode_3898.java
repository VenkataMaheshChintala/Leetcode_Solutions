public class leetcode_3898 {
    public int findOnes(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 1) {
                count++;
            }
        }
        return count;
    }
    public int[] findDegrees(int[][] matrix) {
        int[] res = new int[matrix.length];
        for(int i=0;i<res.length;i++) {
            res[i] = findOnes(matrix[i]);
        }
        return res;
    }
}
