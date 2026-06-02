public class leetcode_443 {
    public int compress(char[] chars) {
        int i = 0;
        int index = 0;
        while(i < chars.length) {
            char curr = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }
            chars[index++] = curr;
            if(count > 1) {
                for(char ch : String.valueOf(count).toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}
