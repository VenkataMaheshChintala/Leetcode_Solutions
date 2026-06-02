import java.util.ArrayList;
import java.util.List;

public class leetcode_2130 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public int pairSum(ListNode head) {
        ListNode temp = head,mid = head;
        while(temp!=null && temp.next!=null) {
            mid = mid.next;
            temp = temp.next.next;
        }
        List<Integer> list = new ArrayList<>();
        temp = head;
        while(temp!=mid) {
            list.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int ans = 0;
        int index = list.size()-1;
        while(mid!=null) {
            ans = Math.max(ans,(mid.val+list.get(index)));
            index--;
            mid = mid.next;
        }
        return ans;
    }
}
