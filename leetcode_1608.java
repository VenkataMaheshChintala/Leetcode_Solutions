public class leetcode_1608 {
    public static void main(String[] args) {
        int arr[] = {0,0};
        System.out.println(specialArray(arr));
    }
    public static int specialArray(int[] nums) {
        int x=0,ans=0;
        while(x<=nums.length){
            ans = function(nums,x);
            if(ans==x) return x;
            x++;
        }
        return -1;
    }
    public static int function(int[] nums,int x) {
        int temp=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] >= x) temp++;
        }
        return temp;
    }
}
