import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_40 {
    public List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, target, new ArrayList<>(), 0, 0);
        return ans;
    }

    public void helper(int[] candidates, int target, List<Integer> list, int currentSum, int sIndex) {
        if (currentSum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (currentSum > target) {
            return;
        }
        for (int i = sIndex; i < candidates.length; i++) {
            if (i > sIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            helper(candidates, target, list, currentSum + candidates[i], i + 1);
            list.removeLast();
        }
    }
}
