public class leetcode_2264 {
    public String largestGoodInteger(String num) {
        int max = -1;
        int temp = -1;
        String ans = "";
        for(int i=0;i<=(num.length()-3);i++) {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                temp = Integer.parseInt(String.valueOf(num.substring(i,i+3)));
                if(temp > max) {
                    max = temp;
                    ans =num.substring(i,i+3);
                }
            }
        }
        return ans;
    }
}
