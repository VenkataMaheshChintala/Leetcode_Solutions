import java.util.ArrayList;
import java.util.List;

public class leetcode_3731 {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
            list.add(nums[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=min;i<=max;i++) {
            if(!list.contains(i)) ans.add(i);
        }
        return ans;
    }
}
