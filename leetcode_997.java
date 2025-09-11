public class leetcode_997 {
    public int findJudge(int n, int[][] trust) {
        int possible_judge = -1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = i;
        }
        for(int i=0;i<trust.length;i++) {
            arr[trust[i][0]-1] = -1;
        }
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != -1) {
                count++;
                if(count > 1) return -1;
                possible_judge = i+1;
            }
        }
        for(int i=0;i<n;i++) {
            arr[i] = i;
        }
        for(int i=0;i<trust.length;i++) {
            if(trust[i][1] == possible_judge) arr[trust[i][0]-1] = -1;
        }
        count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != -1) {
                count++;
                if(count > 1) return -1;
            }
        }
        return possible_judge;
    }
}
