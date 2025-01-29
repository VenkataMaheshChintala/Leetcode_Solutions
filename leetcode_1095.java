public class leetcode_1095 {
    interface MountainArray {
        public int get(int index);
        public int length();
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexMountainArray(mountainArr);
        if(mountainArr.get(peak) == target) {
            return peak;
        }
        int b1 = binary_search(mountainArr,target,0,peak);
        int b2;
        if(b1==-1) {
            b2 = bf(mountainArr,target,peak,mountainArr.length()-1);
            return b2;
        }
        return b1;
    }
    public int peakIndexMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length()-1;
        int mid = (start + end)/2;
        while(start<end) {
            if(arr.get(mid)<arr.get(mid+1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = (start + end)/2;
        }
        return start;
    }
    public int binary_search(MountainArray arr,int target,int start,int end) {
        int mid = (start + end)/2;
        while(start<=end) {
            mid = (start + end)/2;
            if(arr.get(mid)<target) {
                start = mid + 1;
            } else if (arr.get(mid)>target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static int bf(MountainArray arr,int target,int start,int end) {
        int mid;
        while(start<=end) {
            mid = (start + end)/2;
            if(arr.get(mid) < target) {
                end = mid - 1;
            } else if (arr.get(mid) > target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    
}
