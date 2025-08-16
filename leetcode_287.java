import java.util.HashMap;

public class leetcode_287 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],i);
            } else {
                return nums[i];
            }
        }
        return 0;
    }
}
