public class leetcode_704 {
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while(start<=end) {
            if(arr[mid]<target) {
                start = mid + 1;
            } else if (arr[mid]>target) {
                end = mid - 1;
            } else {
                return mid;
            }
            mid = (start + end)/2;
        }
        return -1;
    }
}
