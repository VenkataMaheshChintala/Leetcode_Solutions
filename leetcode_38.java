
public class leetcode_38 {
    public static String convertMatrixtoString(int[][] matrix) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][0] == 0) break;
            s.append(matrix[i][0]).append(matrix[i][1]);
        }
        return s.toString();
    }
    public static int[][] convertStringToFreq(String s) {
        int[][] matrix = new int[s.length()][2];
        int i = 0,count=1,j=0,mr=0;
        char temp;
        while(i<s.length()) {
            count = 1;
            temp = s.charAt(i);
            j = i+1;
            while(j < s.length() && temp == s.charAt(j)) {
                count++;
                j++;
            }
            matrix[mr][1] = Integer.parseInt(String.valueOf(temp));
            matrix[mr][0] = count;
            mr++;
            i = j;
        }
        return matrix;
    }
    public static String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        String s = "11";
        for(int i=2;i<n;i++) {
            s = convertMatrixtoString(convertStringToFreq(s));
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(3));
    }
}
