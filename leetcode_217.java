import java.util.HashMap;

public class leetcode_217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
