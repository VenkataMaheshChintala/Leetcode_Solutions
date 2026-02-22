public class leetcode_8 {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        if(s.charAt(0) >= 65 && s.charAt(0) <= 90) {
            return 0;
        }
        if(s.charAt(0) >= 97 && s.charAt(0) <= 122) {
            return 0;
        }
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if(i >= s.length()) return 0;
        boolean isNegative = false;
        if(s.charAt(i)=='-' || s.charAt(i) == '+') {
            if(s.charAt(i) == '-') {
                isNegative = true;
                i++;
            }
            else if(s.charAt(i) == '+') {
                i++;
            }
        }
        if(i >= s.length()) return 0;
        while(i < s.length() && s.charAt(i)=='0') {
            i++;
        }
        if(i >= s.length()) return 0;
        int ans = 0;
        for(int j=i;j<s.length();j++) {
            int digit = s.charAt(j) - '0';
            if(s.charAt(j) < 48 || s.charAt(j) > 57) {
                break;
            }
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)) {
    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
}
            ans = ans * 10;
            ans = ans + Integer.parseInt(String.valueOf(s.charAt(j)));
        }
        if(isNegative) {
            return ans*(-1);
        }
        else return ans;
    }
}
