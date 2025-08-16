import java.util.HashMap;

public class leetcode_41 {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==1 && nums[0]==1) return 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }
        int i=0;
        for(i=1;i<=nums.length;i++) {
            if(!map.containsKey(i)) {
                return i;
            }
        }
        return i;
    }
}
