import java.util.ArrayList;
public class leetcode_27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums,int val) {
        ArrayList <Integer> temp = new ArrayList<>(1);
        for(int i=0;i< nums.length;i++) {
            if(nums[i]==val) nums[i] = 101;
            if(nums[i]!=101) temp.add(nums[i]);
        }
        int ans = temp.size();
        int index;
        while(true) {
            index = temp.indexOf(101);
            if(index==-1) break;
            temp.remove(index);
            break;
        }
        for(int i=0,j=0;i<temp.size()&& j<temp.size();i++) {
            if(temp.get(i) == 101) continue;
            nums[j] = temp.get(i);
            j++;
        }
        return ans;
    }
}
