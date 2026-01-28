import java.util.ArrayList;
import java.util.List;

public class leetcode_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows == 1) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            list.add(temp);
            return list;
        }
        if(numRows == 2) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            list.add(temp);
            temp = new ArrayList<>();
            temp.add(1);
            temp.add(1);
            list.add(temp);
            return list;
        }
		List<Integer> temp = new ArrayList<>();
		temp.add(1);
		list.add(temp);
		temp = new ArrayList<>();
		temp.add(1);
		temp.add(1);
		list.add(temp);
		for(int i=3;i<=numRows;i++) {
		    List<Integer> temp1 = new ArrayList<>();
		    temp = list.getLast();
		    temp1.add(1);
		    for(int j=1;j<temp.size();j++) {
		        temp1.add(temp.get(j-1)+temp.get(j));
		    }
		    temp1.add(1);
		    list.add(temp1);
		}
        return list;
    }
}
