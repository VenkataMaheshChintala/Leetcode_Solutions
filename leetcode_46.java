import java.util.ArrayList;
import java.util.List;

public class leetcode_46 {
    public List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            l1.add(nums[i]);
        }
        List<Integer> l2 = new ArrayList<>();
        helper(l2,l1);
        return list;
    }
    public void helper(List<Integer> l1,List<Integer> l2) {
        if(l2.isEmpty()) {
            list.add(l1);
            return;
        }
        List<Integer> temp;
        for(int i=0;i<=l1.size();i++) {
            temp = new ArrayList<>();
            for(int j=0;j<i;j++) {
                temp.add(l1.get(j));
            }
            temp.add(l2.get(0));
            for(int j=i;j<l1.size();j++) {
                temp.add(l1.get(j));
            }
            helper(temp,l2.subList(1,l2.size()));
        }
    }
}
