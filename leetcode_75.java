import java.util.ArrayList;
import java.util.Arrays;

public class leetcode_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>(3);
        ArrayList<Integer> list2 = new ArrayList<>(3);
        ArrayList<Integer> list3 = new ArrayList<>(3);
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) list1.add(0);
            else if (nums[i]==1) list2.add(1);
            else list3.add(2);
        }
        int p =0;
        for(int i=0;i<list1.size();i++) {
            nums[p] = 0;
            p++;
        }
        for(int i=0;i<list2.size();i++) {
            nums[p] = 1;
            p++;
        }
        for(int i=0;i<list3.size();i++) {
            nums[p] = 2;
            p++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
