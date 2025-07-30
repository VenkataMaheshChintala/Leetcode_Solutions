import java.util.HashMap;
import java.util.Map;

public class leetcode_169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int temp;
        for(int i=0;i<nums.length;i++) {
            if(hashmap.containsKey(nums[i])) {
                temp = hashmap.get(nums[i]);
                temp++;
                hashmap.put(nums[i],temp);
            } else {
                hashmap.put(nums[i],1);
            }
        }
        temp = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(hashmap.get(nums[i]) > (nums.length)/2 || hashmap.get(nums[i]) > hashmap.get(temp)) {
                temp = nums[i];
            }
        }
        return temp;
    }
    public static void printMap(HashMap<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        int[] nums = {6,5,5};
        System.out.println(majorityElement(nums));
    }
}
