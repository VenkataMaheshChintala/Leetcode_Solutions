import java.util.*;

public class leetcode_448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }
        List<Integer> list = new ArrayList<>();
        int temp = -1;
        for(int i=1;i<=nums.length;i++) {
            if(!map.containsKey(i)) list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        List<Integer> list = findDisappearedNumbers(nums);
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
