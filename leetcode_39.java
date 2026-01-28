import java.util.ArrayList;
import java.util.List;

public class leetcode_39 {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,target,new ArrayList<>(),0,0);
        return ans;
    }
    public List<Integer> helper(int[] candidates, int target,List<Integer> list,int currentSum,int sIndex) {
        if(currentSum == target) {
            ans.add(new ArrayList<>(list));
            list.removeLast();
            return list;
        }
        if(currentSum > target) {
            list.removeLast();
            return list;
        }
        List<Integer> temp = new ArrayList<>();
        for(int i=sIndex;i<candidates.length;i++) {
            list.add(candidates[i]);
            temp = helper(candidates,target,list,currentSum+candidates[i],i);
        }
        if(temp.size() > 0) {
            temp.removeLast();
        }
        return temp;
    }
}
