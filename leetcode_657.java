public class leetcode_657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LL"));
    }
    public static boolean judgeCircle(String moves) {
        int[] arr = {0,0};
        for(int i=0;i<moves.length();i++) {
            if(moves.charAt(i) == 'U') {
                arr[0]++;
            } else if (moves.charAt(i) == 'D') {
                arr[0]--;
            } else if (moves.charAt(i) == 'R') {
                arr[1]++;
            } else {
                arr[1]--;
            }
        }
        if(arr[1] == 0 && arr[0] == 0) return true;
        else return false;
    }
}
