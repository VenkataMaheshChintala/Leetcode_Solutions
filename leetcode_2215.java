import java.util.ArrayList;
import java.util.List;

public class leetcode_2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++) {
            list1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++) {
            list2.add(nums2[i]);
        }
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<list1.size();i++) {
            if(!list2.contains(list1.get(i))) {
                if(!temp.contains(list1.get(i))) {
                    temp.add(list1.get(i));
                }
            }
        }
        list.add(temp);
        temp = new ArrayList<>();
        for(int i=0;i<list2.size();i++) {
            if(!list1.contains(list2.get(i))) {
                if(!temp.contains(list2.get(i))) {
                    temp.add(list2.get(i));
                }
            }
        }
        list.add(temp);
        return list;
    }
}
