import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int count = 1;
        int i;
        for(i=0;i<arr.length-1;i++) {
            if(arr[i] == arr[i+1]) {
                count++;
            } else {
                if(list.contains(count)) {
                    return false;
                }
                list.add(count);
                count = 1;
            }
        }
        if(i == arr.length-1) {
            if(list.contains(count)) {
                return false;
            }
            list.add(count);
            count = 1;
        }
        return true;
    }
}
