public class leetcode_1669 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 1;
        ListNode l1 = list1;
        while(count<a) {
            l1 = l1.next;
            count++;
        }
        ListNode l2 = l1;
        count--;
        while(count <= b) {
            l2 = l2.next;
            count++;
        }
        l1.next = l2;
        ListNode l3 = list2;
        while(l3.next != null) {
            l3 = l3.next;
        }
        l1.next = list2;
        l3.next = l2;
        return list1;
    }
}
