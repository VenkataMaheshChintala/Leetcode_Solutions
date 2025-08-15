public class leetcode_24 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode main = head;
        int length=0;
        while(head!=null) {
            if(length>3) break;
            length++;
            head = head.next;
        }
        if(length == 1) {
            return main;
        } else if (length == 2) {
            ListNode temp1 = main;
            ListNode temp2 = main.next;
            temp2.next = temp1;
            temp1.next = null;
            main = temp2;
            return main;
        } else if (length == 3) {
            ListNode temp1 = main;
            ListNode temp2 = main.next;
            ListNode temp3 = main.next.next;
            temp2.next = temp1;
            temp1.next = temp3;
            main = temp2;
            return main;
        } else {
            ListNode temp1 = main;
            ListNode temp2 = main.next;
            ListNode temp3 = main.next.next;
            temp1.next = temp3;
            temp2.next = temp1;
            main = temp2;
            ListNode prev = main.next;
            temp1 = prev.next;
            temp2 = temp1.next;
            temp3 = temp2.next;
            while (temp1 != null && temp2 != null) {
                prev.next = temp2;
                temp2.next = temp1;
                temp1.next = temp3;
                prev = temp1;
                temp1 = prev.next;
                if (temp1 != null) {
                    temp2 = temp1.next;
                    if(temp2 != null) {
                        temp3 = temp2.next;
                    } else {
                        prev.next = temp1;
                        return main;
                    }
                } else {
                    break;
                }
            }
            return main;
        }
    }
}
