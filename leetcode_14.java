public class leetcode_14 {
    public static void main(String[] args) {
        String strs[] = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String strs[]) {
        if(strs.length == 1) {
            return strs[0];
        }
        String sub = "";
        String temp="";
        boolean b;
        for(int i=1;i<strs[0].length()+1;i++) {
            sub = strs[0].substring(0,i);
            b = check(sub,strs);
            if(!b) {
                return temp;
            }
            temp = sub;
        }
        return sub;
    }
    public static boolean check(String str,String[] arr) {
        boolean ans = false;
        String temp = "";
        for(int i=0;i<arr.length;i++) {
            if(arr[i].length() < str.length()) {
                return false;
            }
            temp = arr[i].substring(0,str.length());
            if(temp.contains(str)) {
                ans = true;
            } else {
                ans = false;
                return false;
            }
        }
        return ans;
    }
}
