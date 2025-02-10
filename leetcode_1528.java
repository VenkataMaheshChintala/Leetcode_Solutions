public class leetcode_1528 {
    public static void main(String[] args) {
        int[] indices = {0,1,2};
        System.out.println(restoreString("abc",indices));
    }
    public static String restoreString(String s, int[] indices) {
        int index = 0;
        String ans = "";
        for(int i=0;i<indices.length;i++) {
            index = linear_search(indices,i);
            ans = ans + s.charAt(index);
        }
        return ans;
    }
    public static int linear_search(int[] arr,int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return 0;
    }
}
