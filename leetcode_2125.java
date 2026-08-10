public class leetcode_2125 {
    public int findOnes(String str) {
        int count = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == '1') count++;
        }
        return count;
    }
    public int numberOfBeams(String[] bank) {
        if(bank.length == 1) return 0;
        int count = 0;
        int prevFloor = 0;
        int i = 0;
        while(i<bank.length && findOnes(bank[i]) == 0) {
            prevFloor++;
            i++;
        }
        if(i < bank.length) {
            prevFloor = findOnes(bank[i]);
        } else {
            return 0;
        }
        for(int j=i+1;j<bank.length;j++) {
            int currentFloor = findOnes(bank[j]);
            if(currentFloor != 0) {
                count += (currentFloor * prevFloor);
                prevFloor = currentFloor;
            }
        }
        return count;
    }
}
