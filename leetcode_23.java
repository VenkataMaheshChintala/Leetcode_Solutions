import java.util.PriorityQueue;

public class leetcode_23 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        ListNode list;
        for(int i=0;i<lists.length;i++) {
            list = lists[i];
            while(list!=null) {
                p.add(list.val);
                list = list.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (!p.isEmpty()) {
            head.next = new ListNode(p.poll());
            head = head.next;
        }
        return dummy.next;
    }
}
