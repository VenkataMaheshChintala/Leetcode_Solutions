public class leetcode_4 {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int arr1index = 0;
        int arr2index = 0;
        int resIndex;
            for(resIndex = 0;resIndex<res.length && arr1index < arr1.length && arr2index < arr2.length;resIndex++) {
                if(arr1[arr1index] < arr2[arr2index]) {
                    res[resIndex] = arr1[arr1index];
                    arr1index++;
                } else if (arr1[arr1index] > arr2[arr2index]) {
                    res[resIndex] = arr2[arr2index];
                    arr2index++;
                } else {
                    res[resIndex] = arr1[arr1index];
                    arr1index++;
                }
            }
            if(arr1index < arr1.length) {
                for(int i = arr1index;i<arr1.length;i++) {
                    res[resIndex] = arr1[i];
                    resIndex++;
                }
            }
            if(arr2index < arr2.length) {
                for(int i=arr2index;i<arr2.length;i++) {
                    res[resIndex] = arr2[i];
                    resIndex++;
                }
            }
        if((res.length%2) != 0) {
            return (double) res[(res.length-1)/2];
        } else {
            double ans = res[(res.length)/2] + res[(res.length/2)-1];
            return (ans/2);
        }
    }
}
