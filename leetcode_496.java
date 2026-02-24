public class leetcode_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i,j,k;
        int[] ans = new int[nums1.length];
        for(i=0;i<nums1.length;i++) {
            for(j=0;j<nums2.length;j++) {
                if(nums1[i] == nums2[j]) {
                    break;
                }
            }
            k = j;
            while(k<nums2.length && nums2[k]<=nums1[i]) {
                k++;
            }
            if(k==nums2.length) ans[i] = -1;
            else ans[i] = nums2[k];
        }
        return ans;
    }
}
