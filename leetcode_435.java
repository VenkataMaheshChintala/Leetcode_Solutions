import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class leetcode_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        ArrayList<ArrayList<Integer>> listIntervals = new ArrayList<>();
        ArrayList<Integer> temp;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for(int i=0;i<intervals.length;i++) {
            temp = new ArrayList<>();
            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);
            listIntervals.add(temp);
        }
        int count = 0;
        for(int i=1;i<listIntervals.size();i++) {
            if(listIntervals.get(i-1).get(1) > listIntervals.get(i).get(0)) {
                count++;
                if(listIntervals.get(i-1).get(1) > listIntervals.get(i).get(1)) {
                    listIntervals.remove(i-1);
                } else {
                    listIntervals.remove(i);
                }
                i--;
            }
        }
        return count;
    }
}
