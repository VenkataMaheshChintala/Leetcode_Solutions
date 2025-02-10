public class leetcode_1108 {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
    public static String defangIPaddr(String address) {
        String answer = "";
        for(int i=0;i<address.length();i++) {
            if(address.charAt(i)=='.') {
                answer = answer + "[.]";
            } else {
                answer = answer + address.charAt(i);
            }
        }
        return answer;
    }
}
