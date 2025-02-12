public class leetcode_557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");
        for(int i=0;i<arr.length;i++) {
            temp.delete(0,temp.length());
            temp.append(arr[i]);
            res.append(temp.reverse()+ " ");
        }
        res = res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
