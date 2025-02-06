import java.util.Arrays;

public class leetcode_189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] array,int k) {
        if(array.length == 1) {
            return;
        }
        if(k>array.length) {
            while(k >= array.length) {
                k-= array.length;
            }
        }
        int[] temp1 = new int[k];
        if(k == array.length) {
            return;
        } else {
            System.arraycopy(array,array.length-k,temp1,0,k);
            System.out.println(Arrays.toString(temp1));
            for(int i=array.length-k-1;i>=0;i--) {
                array[i+k] = array[i];
            }
            System.arraycopy(temp1,0,array,0,k);
        }
    }
}
