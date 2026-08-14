public class leetcode_1769 {
    public int moveLeft(String boxes,int index) {
        if(index == boxes.length()) return 0;
        int sum = 0;
        for(int i=index+1;i<boxes.length();i++) {
            if(boxes.charAt(i) != '0') {
                sum += (i-index);
            }
        }
        return sum;
    }
    public int moveRight(String boxes,int index) {
        if(index == 0) return 0;
        int sum = 0;
        for(int i=0;i<index;i++) {
            if(boxes.charAt(i) != '0') {
                sum += (index-i);
            }
        }
        return sum;
    }
    public int moves(String boxes,int index) {
        return moveRight(boxes,index) + moveLeft(boxes,index);
    }
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++) {
            ans[i] = moves(boxes,i);
        }
        return ans;
    }
}
