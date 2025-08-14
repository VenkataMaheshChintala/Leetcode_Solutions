import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_442 {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
               list.add(nums[i]);
            } else {
                map.put(nums[i],i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {};
        List<Integer> list = findDuplicates(nums);
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
