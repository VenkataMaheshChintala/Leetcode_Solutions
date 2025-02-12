public class leetcode_1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }
    public static String sortSentence(String s) {
        String[] temparr = s.split(" ");
        String temp = "";
        String[] arr = new String[temparr.length];
        StringBuilder ans = new StringBuilder("");
        Integer x = 1;
        for(int i=0;i<temparr.length;i++) {
            int index = s.indexOf(x.toString());
            temp = s.substring(0, index);
            arr = temp.split(" ");
            ans = ans.append(arr[arr.length - 1] + " ");
            x++;
        }
        String res = ans.toString();
        res = res.substring(0,res.length()-1);
        return res;
    }
}
