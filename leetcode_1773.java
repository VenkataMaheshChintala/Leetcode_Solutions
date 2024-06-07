import java.util.ArrayList;
import java.util.List;

public class leetcode_1773 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");
        List<String> list2 = new ArrayList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
        List<String> list3 = new ArrayList<>();
        list3.add("phone");
        list3.add("silver");
        list3.add("iphone");
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(list);
        String rulekey = "color";
        String rulevalue = "silver";
        int answer = countMatches(list, rulekey, rulevalue);
        System.out.println(answer);
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int rk;
        if(ruleKey.equals("type")) {
            rk = 1;
        } else if (ruleKey.equals("color")) {
            rk = 2;
        } else {
            rk = 3;
        }
        System.out.println(rk);
        int i = 0;
        int count=0;
        String temp;
        while(i<items.size()) {
            temp = items.get(i).get(rk-1);
            if(ruleValue.equals(temp)) {
                count++;
            }
            i++;
        }
        return count;
    }
}
