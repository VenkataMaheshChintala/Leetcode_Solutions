import java.util.ArrayList;
import java.util.List;

public class leetcode_1823 {
    public int findTheWinner(int n, int k) {
        List<Integer> circle = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            circle.add(i);
        }
        int currentPos = 0;
        while(circle.size() > 1) {
            currentPos += (k-1);
            currentPos = currentPos % circle.size();
            circle.remove(currentPos);
        }
        return circle.get(0);
    }
}
