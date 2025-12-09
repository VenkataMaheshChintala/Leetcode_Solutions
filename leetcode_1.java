import java.util.Arrays;
import java.util.HashMap;

public class leetcode_1 {
    public static void main(String[] args) {
        int target = 6;
        int[] inp = {3,3};
        int[] result = twoSum(target,inp);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int target,int[] nums) {
        int[] result = new int[2];
        int temp;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            hashmap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++) {
            temp = target - nums[i];
            if(hashmap.containsKey(temp)) {
                if(hashmap.get(temp) != i) {
                    result[0] = hashmap.get(temp);
                    result[1] = i;
                    return result;
                }
            }
        }
        return result;
    }
}
