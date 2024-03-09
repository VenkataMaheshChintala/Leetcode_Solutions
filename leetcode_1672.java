public class leetcode_1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        int r1 = 0,r2 = 0;
        for(int i=0;i< accounts.length;i++) {
            r2 = 0;
            for(int j=0;j<accounts[i].length;j++) {
                r2 += accounts[i][j];
            }
            if(r2>r1) {
                r1 = r2;
            }
        }
        System.out.println(r1);
    }
}