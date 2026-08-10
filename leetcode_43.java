public class leetcode_43 {
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int length1 = num1.length();
        int length2 = num2.length();
        int[] productArray = new int[length1 + length2];
        for (int i = length1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = length2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                productArray[i + j + 1] += digit1 * digit2;
            }
        }
        for (int i = productArray.length - 1; i > 0; i--) {
            productArray[i - 1] += productArray[i] / 10;
            productArray[i] %= 10;
        }
        int startIndex = productArray[0] == 0 ? 1 : 0;
        StringBuilder result = new StringBuilder();
        for (int i = startIndex; i < productArray.length; i++) {
            result.append(productArray[i]);
        }
      
        return result.toString();
    }
}
