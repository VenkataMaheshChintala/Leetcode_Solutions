import java.util.ArrayList;
import java.util.List;

public class leetcode_119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        if(rowIndex == 0) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            list.add(temp);
            return temp;
        }
        if(rowIndex == 1) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            list.add(temp);
            temp = new ArrayList<>();
            temp.add(1);
            temp.add(1);
            list.add(temp);
            return temp;
        }
		List<Integer> temp = new ArrayList<>();
		temp.add(1);
		list.add(temp);
		temp = new ArrayList<>();
		temp.add(1);
		temp.add(1);
		list.add(temp);
		for(int i=2;i<=rowIndex;i++) {
		    List<Integer> temp1 = new ArrayList<>();
		    temp = list.getLast();
		    temp1.add(1);
		    for(int j=1;j<temp.size();j++) {
		        temp1.add(temp.get(j-1)+temp.get(j));
		    }
		    temp1.add(1);
		    list.add(temp1);
		}
        return list.get(rowIndex);
    }
}
