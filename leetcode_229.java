import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode_229 {
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int temp;
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                temp = map.get(nums[i]);
                temp++;
                map.put(nums[i],temp);
            } else {
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++) {
            temp = map.get(nums[i]);
            if(temp > (nums.length)/3 && !(list.contains(nums[i]))) list.add(nums[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> list = majorityElement(nums);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
