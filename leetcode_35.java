public class leetcode_35 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                ans = mid;
                start = mid + 1;
            } else { 
                return mid;
            }
        }
        return ans + 1;
    }
}
