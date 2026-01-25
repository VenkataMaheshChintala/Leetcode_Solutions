public class leetcode_796 {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        StringBuilder str;
        for(int i=s.length()-1;i>=0;i--) {
            str = new StringBuilder("");
            str.append(s.substring(0,i));
            str.insert(0,s.substring(i));
            if(str.toString().equals(goal)) return true;
        }
        return false;
    }
}
