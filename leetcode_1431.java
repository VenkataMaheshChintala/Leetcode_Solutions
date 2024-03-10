import java.util.ArrayList;

public class leetcode_1431 {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        ArrayList<Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies,int extraCandies) {
        int sum = 0;
        boolean result = false;
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++) {
            sum = sum + candies[i];
        }
        int temp;
        for(int i=0;i<candies.length;i++) {
            temp = candies[i];
            temp += extraCandies;
            result = IsMax(temp,candies);
            ans.add(result);
        }
        return ans;
    }
    static boolean IsMax(int n,int[] arr) {
        int max = n;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>=max) {
                max = arr[i];
            }
        }
        if(max==n) return true;
        else return false;
    }
}
