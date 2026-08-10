public class leetcode_1545 {
    public StringBuilder invert(StringBuilder s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '0') {
                ans.append('1');
            } else {
                ans.append('0');
            }
        }
        return ans;
    }
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        for(int i=1;i<=n;i++) {
            StringBuilder temp = new StringBuilder();
            temp.append(s);
            temp.append(1);
            s.reverse();
            temp.append(invert(s));
            s = new StringBuilder(temp);
        }
        return s.charAt(k-1);
    }
}
