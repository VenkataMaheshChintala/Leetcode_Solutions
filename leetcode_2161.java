import java.util.Arrays;

public class leetcode_2161 {

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int[] less = new int[nums.length];
        int[] greater = new int[nums.length];
        int[] equal = new int[nums.length];
        int i=0,j=0,k=0,temp=0;
        for(int x=0;x<nums.length;x++) {
            if(nums[x] < pivot) {
                less[i] = nums[x];
                i++;
            } else if (nums[x] > pivot) {
                greater[j] = nums[x];
                j++;
            } else {
                equal[k] = pivot;
                k++;
            }
        }
        for(temp = 0;temp<i;temp++) {
            result[temp] = less[temp];
        }
        for(i=0;i<k;i++) {
            result[temp] = pivot;
            temp++;
        }
        for(i=0;i<j;i++) {
            result[temp] = greater[i];
            temp++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-3,4,3,2};
        int pivot = 2;
        int[] ans = pivotArray(nums, pivot);
        System.out.println(Arrays.toString(ans));
    }
}
