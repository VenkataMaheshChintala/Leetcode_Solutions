public class leetcode_392 {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s,String t) {
        int pos,temp=0;
        for(int i=0;i<s.length();i++) {
            pos = search(t,s.charAt(i),temp);
            if(pos==-1) return false;
            temp = pos+1;
        }
        return true;
    }
    public static int search(String t,char ch,int start) {
        for(int i=start;i<t.length();i++) {
            if(ch==t.charAt(i)) return i;
        }
        return -1;
    }
}
