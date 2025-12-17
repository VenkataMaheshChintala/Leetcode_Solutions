import java.util.ArrayList;
import java.util.List;

public class leetcode_77 {
    public List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            list.add(i);
        }
        print(new ArrayList<>(),list,k);
        return ans;
    }
    public void print(List<Integer> p,List<Integer> up,int k) {
        if(p.size() == k) {
            List<Integer> ans1 = new ArrayList<>(p);
            ans.add(ans1);
            return;
        }
        for(int i=0;i<up.size();i++) {
            List<Integer> temp = new ArrayList<>(p);
            List<Integer> temp1 = new ArrayList<>(up.subList(i+1,up.size()));
            temp.add(up.get(i));
            print(temp,temp1,k);
        }
    }
}
