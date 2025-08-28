import java.util.HashMap;

public class leetcode_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                int temp = map.get(nums[i]);
                if(Math.abs(temp - i) <= k) return true;
                else map.put(nums[i],i);
            } else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
