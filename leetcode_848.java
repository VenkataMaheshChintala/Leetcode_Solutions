public class leetcode_848 {
    public String shiftingLetters(String s, int[] shifts) {
        int[] prefix = new int[shifts.length];
        prefix[prefix.length-1] = shifts[shifts.length-1];
        prefix[prefix.length-1] = prefix[prefix.length-1]%26;
        for(int i=prefix.length-2;i>=0;i--) {
            prefix[i] = prefix[i+1] + shifts[i];
            prefix[i] %= 26;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            int ascii = s.charAt(i);
            ascii += prefix[i];
            if(ascii > 122) {
                int diff = ascii - 122;
                ascii = 96 + diff;
            }
            ans.append((char) ascii);
        }
        return ans.toString();
    }
}
