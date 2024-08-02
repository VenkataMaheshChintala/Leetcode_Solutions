import java.util.Arrays;

public class leetcode_349 {
    public static void main(String[] args) {
        int nums1[] = {8,0,3};
        int nums2[] = {0,0};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    static int[] intersection(int[] nums1, int nums2[]) {
        int ele,res1,res2,pos=0;
        int len = nums1.length>nums2.length?nums2.length:nums1.length;
        int res[] = new int[len];
        Arrays.fill(res, -1);
        if(nums1.length<nums2.length) {
            for(int i=0;i<nums1.length;i++) {
                ele = nums1[i];
                res1 = linear_search(nums2,ele);
                if(res1!=-1) {
                    res2 = linear_search(res,ele);
                    if(res2==-1) {
                        res[pos] = ele;
                        pos ++;
                    }
                }
            }
        } else {
            for(int i=0;i<nums2.length;i++) {
                ele = nums2[i];
                res1 = linear_search(nums1,ele);
                if(res1!=-1) {
                    res2 = linear_search(res,ele);
                    if(res2==-1) {
                        res[pos] = ele;
                        pos ++;
                    }
                }
            }
        }
        int ans[] = new int[pos];
        for(int i=0;i<ans.length;i++) {
            ans[i] = res[i];
        }
        return ans;
    }
    static int linear_search(int[] arr,int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return 0;
            }
        }
        return -1;
    }
}
