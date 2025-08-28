import java.util.Arrays;
import java.util.HashMap;

public class leetcode_347 {

    public static int findMin(HashMap<Integer,Integer> map,int[] nums) {
        int temp = 0,ele=0;
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i])) {
                if (map.get(nums[i]) > temp) {
                    temp = map.get(nums[i]);
                    ele = nums[i];
                }
            }
        }
        return ele;
    }

    public static int[] topKFrequent(int[] nums, int k) {
//        if(nums.length == 1) return new int[] {nums[0]};
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp;
        int max = 0,ele = 0;
        for(int i=0;i< nums.length;i++) {
            if(map.containsKey(nums[i])) {
                temp = map.get(nums[i]);
                temp++;
                if(temp > max) {
                    max = temp;
                    ele = nums[i];
                }
                map.put(nums[i],temp);
            } else {
                map.put(nums[i],1);
                if(max == 0) {
                    max = 1;
                    ele = nums[i];
                }
            }
        }
        ans[0] = ele;
        map.remove(ele);
        for(int i=1;i<k;i++) {
            temp = findMin(map,nums);
            ans[i] = temp;
            map.remove(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(topKFrequent(nums,1)));
    }
}
