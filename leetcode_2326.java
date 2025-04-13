import java.util.Arrays;

public class leetcode_2326 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i],-1);
        }
        ListNode temp = head;
        int sr,er,sc,ec;
        sr = 0;
        er = m-1;
        sc = 0;
        ec = n-1;
        while(temp!=null) {
            for(int i=sc;i<=ec && temp!=null;i++) {
                matrix[sr][i] = temp.val;
                temp = temp.next;
            }
            if(temp==null) break;
            sr++;
            for(int i=sr;i<=er && temp!=null ;i++) {
                matrix[i][ec] = temp.val;
                temp = temp.next;
            }
            if(temp==null) break;
            ec--;
            for(int i=ec;i>=sc && temp!=null;i--) {
                matrix[er][i] = temp.val;
                temp = temp.next;
            }
            if(temp==null) break;
            er--;
            for(int i = er; i>=sr && temp!=null; i--) {
                matrix[i][sc] = temp.val;
                temp = temp.next;
            }
            sc++;
        }
        return matrix;
    }
}
