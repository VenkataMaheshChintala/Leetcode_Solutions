public class leetcode_162{
    public static void main(String[] args) {
        int arr[] = {0,1,2,0};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while(start<end) {
            if(arr[mid]<arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = (start + end)/2;
        }
        return start;
    }
}