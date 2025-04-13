public class leetcode_2181 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeNodes(ListNode head) {
        if(head == null) return null;
        ListNode ans = new ListNode(0);
        ListNode ans_pointer = ans;
        ListNode temp = head.next;
        ListNode temp2;
        int sum;
        while(temp!=null) {
            sum = 0;
            ListNode temp1 = temp;
            while(temp1.val != 0) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if(sum == 0) continue;
            temp2 = new ListNode(sum);
            temp2.next = null;
            ans_pointer.next = temp2;
            ans_pointer = ans_pointer.next;
            temp = temp1.next;
        }
        return ans.next;
    }
}
