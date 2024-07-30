public class leetcode_852 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0};
        int ans = peakIndexMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(true) {
            if(arr[mid]<arr[mid+1]) {
                start = mid + 1;
            }
            if(arr[mid]>arr[mid+1]) {
                end = mid;
            }
            mid = (start + end)/2;
            if(start==end) {
                break;
            }
        }
        return mid;
    }
}
