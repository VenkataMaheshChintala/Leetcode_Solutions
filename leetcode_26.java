import java.util.ArrayList;

public class leetcode_26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        ArrayList <Integer> n = new ArrayList<>(2);
        int k = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==101) continue;
            k++;
            n.add(nums[i]);
            for(int j=i+1;j< nums.length;j++) {
                if(nums[i]==nums[j]) nums[j]=101;
                else break;
            }
        }
        for(int i=0;i<n.size();i++) {
            nums[i] = n.get(i);
        }
        return k;
    }
}