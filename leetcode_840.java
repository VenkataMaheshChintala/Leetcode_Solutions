public class leetcode_840 {
    public boolean lemonadeChange(int[] bills) {
        int n5 = 0;
        int n10 = 0;
        for(int i=0;i<bills.length;i++) {
            if(bills[i] == 5) {
                n5++;
            } else if (bills[i] == 10) {
                if(n5 > 0) {
                    n5--;
                    n10++;
                } else {
                    return false;
                }
            } else {
                if(n10 >= 1) {
                    if (n5 >= 1) {
                        n10--;
                        n5--;
                    } else {
                        return false;
                    }
                } else if(n5 >= 3) {
                    n5 -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
