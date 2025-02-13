public class leetcode_2000 {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
    }
    public static String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)!=-1) {
            int index = word.indexOf(ch);
            StringBuilder temp = new StringBuilder(word.substring(0, index + 1));
            temp.reverse();
            StringBuilder temp1 = new StringBuilder(word.substring(index+1,word.length()));
            temp.append(temp1);
            return temp.toString();
        } else {
            return word;
        }
    }
}
