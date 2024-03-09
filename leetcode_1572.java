public class leetcode_1572 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        int ans = diagonalSum((mat));
        System.out.println(ans);
    }
    static int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        int temp=0;
        if((len%2)!=0) {
            temp = mat[len/2][len/2];
            mat[len/2][len/2] = 0;
        }
        for(int i=0;i<len;i++) {
            for(int j=0;j<len;j++) {
                if(i==j) sum += mat[i][j];
                if(i+j==(len-1)) sum += mat[i][j];
            }
        }
        return sum+temp;
    }
}
