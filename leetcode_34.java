import java.util.Arrays;
import java.util.Scanner;
public class leetcode_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of elements : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        int[] answer = searchRange(nums,target);
        System.out.println(Arrays.toString(answer));
        sc.close();
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int result = 0;
        int temp = -1;
        int send;
        int[] resultArray = new int[2];
        int temp1 = BinarySearch(nums,target,start,end);
        if(temp1 == -1) {
            resultArray[0] = -1;
            resultArray[1] = -1;
            return resultArray;
        }
        while(true) {
            temp = result;
            result = BinarySearch(nums,target,start,end);
            if(result==-1) {
                send = temp;
                break;
            } else {
                end = result - 1;
            }
        }
        resultArray[0] = send;
        start = 0;
        end = nums.length-1;
        result = 0;
        temp = -1;
        int lend;
        while (true) {
            temp = result;
            result = BinarySearch(nums,target,start,end);
            if(result==-1) {
                lend = temp;
                break;
            } else {
                start = result + 1;
            }
        }
        resultArray[1] = lend;
        return resultArray;
    }
    public static int BinarySearch(int[] nums,int target,int start,int end) {
        int mid;
        while(start<=end) {
            mid = (int) (start+end)/2;
            if(target==nums[mid]) {
                return mid;
            } else if(target<nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
