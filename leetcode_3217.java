import java.util.HashSet;
import java.util.Set;

public class leetcode_3217 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        ListNode current = head;
        ListNode prev = null;
        while(current!=null) {
            if(set.contains(current.val)) {
                if(prev == null) {
                    prev = null;
                    current = current.next;
                    head = head.next;
                } else {
                    prev.next = current.next;
                    current = current.next;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}
