import java.util.ArrayList;
import java.util.Objects;

public class leetcode_234 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int size = list.size();
        boolean ans = false;
        for(int i=0;i<size;i++) {
            if(Objects.equals(list.get(i), list.get(size - 1))) {
                ans = true;
                size--;
            } else {
                return false;
            }
        }
        return ans;
    }
}
