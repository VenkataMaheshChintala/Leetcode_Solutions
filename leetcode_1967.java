public class leetcode_1967 {
    public static void main(String[] args) {
        System.out.println(numOfStrings(new String[]{"a","abc","bc","d"},"abc"));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i=0;i<patterns.length;i++) {
            if(word.contains(patterns[i])) {
                count++;
            }
        }
        return count;
    }
}
