import java.util.ArrayList;
import java.util.List;

public class leetcode_93 {
    public boolean validate(String s) {
        if(s.length() > 1 && s.charAt(0)=='0') return false;
        int temp = Integer.parseInt(s);
        if(temp < 0 || temp > 255) return false;
        return true;
    }
    public List<String> list;
    public void helper(StringBuilder s,int lastIndex,int rem) {
        if(rem == 0) {
            if(s.length() - lastIndex >= 3) return;
            else {
                String str = s.toString();
                String[] arr = str.split("\\.");
                int i=0;
                boolean flag = false;
                for(i=0;i<arr.length;i++) {
                    if(!validate(arr[i])) flag = true;
                }
                if(!flag) {
                    list.add(s.toString());
                }
            }
            return;
        }
        if(lastIndex >= s.length()) return;
        
        s.insert(lastIndex,".");
        helper(s,lastIndex+2,rem-1);
        s.deleteCharAt(lastIndex);
        
        if(lastIndex+1 < s.length()) {
            s.insert(lastIndex+1,".");
            helper(s,lastIndex+3,rem-1);
            s.deleteCharAt(lastIndex+1);
        }
        
        if(lastIndex+2 < s.length()) {
            s.insert(lastIndex+2,".");
            helper(s,lastIndex+4,rem-1);
            s.deleteCharAt(lastIndex+2);
        }
    }
    public List<String> restoreIpAddresses(String s) {
        list = new ArrayList<>();
        helper(new StringBuilder(s),1,3);
        return list;
    }
}
