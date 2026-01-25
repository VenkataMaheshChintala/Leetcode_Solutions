public class leetcode_1903 {
    public String largestOddNumber(String num) {
        int digit = 0;
        int position = num.length()-1;
        while(position >= 0) {
            digit = Integer.parseInt(String.valueOf(num.charAt(position)));
            if((digit%2) == 0) {
                position--;
                continue;
            }
            return num.substring(0,position+1);
        }
        return new String("");
    }
}
