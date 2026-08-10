import java.util.ArrayList;
import java.util.List;

public class leetcode_3751 {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for(int i=num1;i<=num2;i++) {
            int num = i;
            if(num < 100) continue;
            List<Integer> list = new ArrayList<>();
            while(num > 0) {
                int ld = num%10;
                list.add(ld);
                num/=10;
            }
            for(int j=1;j<list.size()-1;j++) {
                if(list.get(j) > list.get(j+1) && list.get(j) > list.get(j-1)) {
                    ans++;
                } 
                if(list.get(j) < list.get(j+1) && list.get(j) < list.get(j-1)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
