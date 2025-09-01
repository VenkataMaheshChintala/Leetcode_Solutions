public class leetcode_912 {
    public void merge(int[] arr,int low,int high) {
        int[] res = new int[arr.length];
        int mid = (low + high)/2;
        int i = low,j = mid + 1,k = low;
        while(i<=mid && j<=high) {
            if(arr[i] <= arr[j]) {
                res[k++] = arr[i++];
            } else {
                res[k++] = arr[j++];
            }
        }
        while(i<=mid) {
            res[k++] = arr[i++];
        }
        while(j<=high) {
            res[k++] = arr[j++];
        }
        for(i=low;i<=high;i++) {
            arr[i] = res[i];
        }
    }
    public int[] mergeSort(int[] arr,int low,int high) {
        if(low < high) {
            int mid = (low + high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,high);
        }
        return arr;
    }
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}
