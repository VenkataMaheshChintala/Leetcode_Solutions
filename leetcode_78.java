import java.util.ArrayList;
import java.util.List;

public class leetcode_78 {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> half = new ArrayList<>();
        List<Integer> nextHalf = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            nextHalf.add(nums[i]);
        }
        sequence(half,nextHalf);
        return ans;
    }
    public void sequence(List<Integer> half,List<Integer> nextHalf) {
        if(nextHalf.isEmpty()) {
            List<Integer> temp = new ArrayList<>(half);
            ans.add(temp);
            return;
        }
        List<Integer> nextHalfSubList = new ArrayList<>(nextHalf.subList(1,nextHalf.size()));
        sequence(new ArrayList<>(half),nextHalfSubList);
        List<Integer> newHalf = new ArrayList<>(half);
        newHalf.add(nextHalf.get(0));
        sequence(newHalf,nextHalfSubList);
    }
}
