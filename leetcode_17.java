import java.util.ArrayList;
import java.util.List;

public class leetcode_17 {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        ans = solution("");
        System.out.println(ans);
    }
    public static List<String> solution(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        List<String> result = new ArrayList<>();
        String temp = new String("");
        if(digits.length() == 1) {
            return switchfunc(l1,digits,0);
        } else if (digits.length() == 2) {
            l1 = switchfunc(l1,digits,0);
            l2 = switchfunc(l2,digits,1);
            for(int i=0;i<l1.size();i++) {
                for(int j=0;j<l2.size();j++) {
                    temp = l1.get(i) + l2.get(j);
                    result.add(temp);
                    temp = "";
                }
            }
            return result;
        } else {
            l1 = switchfunc(l1,digits,0);
            l2 = switchfunc(l2,digits,1);
            for(int i=0;i<l1.size();i++) {
                for(int j=0;j<l2.size();j++) {
                    temp = l1.get(i) + l2.get(j);
                    result.add(temp);
                    temp = "";
                }
            }
            for(int i=2;i<digits.length();i++) {
                l1.clear();
                l1 = new ArrayList<>(result);
                l2.clear();
                l2 = switchfunc(l2,digits,i);
                result.clear();
                for(int j= 0; j<l1.size(); j++) {
                    for(int k=0;k<l2.size();k++) {
                        temp = l1.get(j) + l2.get(k);
                        result.add(temp);
                        temp = "";
                    }
                }
            }
            return result;
        }
    }
    public static List<String> switchfunc(List<String> l1,String digits,int index) {
        switch(digits.charAt(index)) {
            case '2':
                l1.add("a");
                l1.add("b");
                l1.add("c");
                break;
            case '3':
                l1.add("d");
                l1.add("e");
                l1.add("f");
                break;
            case '4':
                l1.add("g");
                l1.add("h");
                l1.add("i");
                break;
            case '5':
                l1.add("j");
                l1.add("k");
                l1.add("l");
                break;
            case '6':
                l1.add("m");
                l1.add("n");
                l1.add("o");
                break;
            case '7':
                l1.add("p");
                l1.add("q");
                l1.add("r");
                l1.add("s");
                break;
            case '8':
                l1.add("t");
                l1.add("u");
                l1.add("v");
                break;
            case '9':
                l1.add("w");
                l1.add("x");
                l1.add("y");
                l1.add("z");
                break;
            case '1':
                break;
        }
        return l1;
    }
}
