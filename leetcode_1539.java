public class leetcode_1539 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,8,9,10};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
    static int findKthPositive(int[] arr,int k) {
        int temp = 0;
        int n = 1;
        while(true) {
            if(binary_search(arr,n) == -1) {
                temp ++;
            }
            if(temp==k) {
                return n;
            }
            n++;
        }
    }
    static int binary_search(int[] arr,int target) {
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
