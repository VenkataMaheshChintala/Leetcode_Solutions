public class leetcode_495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for(int i=0;i<timeSeries.length-1;i++) {
            if((timeSeries[i+1] - timeSeries[i]) >= duration) {
                count += duration;
            } else {
                count += (timeSeries[i+1]-timeSeries[i]);
            }
        }
        count += duration;
        return count;
    }
}
