import java.util.ArrayList;
import java.util.List;

public class leetcode_216 {
    List<List<Integer>> ans;
    public void helper(int k,int n,List<Integer> currentElements,int currentSum,int index) {
        if(currentElements.size() > k) {
            return;
        }
        if(currentElements.size() == k) {
            if(currentSum == n) {
                ans.add(new ArrayList<>(currentElements));
            }
            return;
        }
        if(currentSum < n) {
            for(int i=index;i<=9;i++) {
                currentElements.add(i);
                helper(k,n,new ArrayList<>(currentElements),currentSum+i,i+1);
                currentElements.removeLast();
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        helper(k,n,new ArrayList<>(),0,1);
        return ans;
    }
}
