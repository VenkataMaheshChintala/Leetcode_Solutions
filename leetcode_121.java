public class leetcode_121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int temp = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i-1] < min) min = prices[i-1];
            temp = prices[i] - min;
            if(temp > max) max = temp;
        }
        return max;
    }
}
