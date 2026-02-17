import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_90 {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> half = new ArrayList<>();
        List<Integer> nextHalf = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            nextHalf.add(nums[i]);
        }
        sequence(half,nextHalf);
        return ans;
    }
    public void sequence(List<Integer> half,List<Integer> nextHalf) {
        if(nextHalf.isEmpty()) {
            if(!ans.contains(half)) {
                List<Integer> temp = new ArrayList<>(half);
                ans.add(temp);
            }
            return;
        }
        List<Integer> nextHalfSubList = new ArrayList<>(nextHalf.subList(1,nextHalf.size()));
        sequence(new ArrayList<>(half),nextHalfSubList);
        List<Integer> newHalf = new ArrayList<>(half);
        newHalf.add(nextHalf.get(0));
        sequence(newHalf,nextHalfSubList);
    }
}
