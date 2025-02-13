public class leetcode_168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder("");
        int i = columnNumber;
        int temp = 0;
        while(i>0) {
            i--;
            temp = i%26;
            ans.append((char) (temp + 'A'));
            i = i/26;
        }
        ans.reverse();
        return ans.toString();
    }
}
